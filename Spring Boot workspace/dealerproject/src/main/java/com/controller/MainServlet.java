package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.dealer.connection.ExcuteQuery;
import com.entity.Car;


/**
 * Servlet implementation class MainServlet
 */
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	final static Logger logger = LogManager.getLogger(MainServlet.class);

    /**
     * Default constructor. 
     */
    public MainServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		
		List<Car> carList = new ArrayList<Car>();
		
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			boolean flag = ExcuteQuery.validate(username, password);
			if (flag) {
				try {
					ResultSet rs= ExcuteQuery.displayCar();
					while(rs.next()){
				
						carList.add(new Car(rs.getString(1),
								rs.getString(2),
								rs.getString(3),
								rs.getString(4),
								rs.getInt(5),
								rs.getInt(6),
								rs.getInt(7)));
					}
					
				}  catch (SQLException e) {
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
				for(Car car: carList){
					
					 out.println(car.getId()+" "+car.getType()+car.getYear()+car.getColor()+car.getModelCompany()+
							 car.getModelName()+car.getModelPrice());
				 }
				HttpSession session = request.getSession();
				request.setAttribute("list",carList);
				session.setAttribute("list",carList);
				response.setStatus(HttpServletResponse.SC_OK);
				RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
				rd.forward(request, response);
				
//				HttpSession session = request.getSession();
//				session.setAttribute("list",carList);
//				//response.sendRedirect("display.jsp");
				
			} else {
				out.print("Sorry UserName or Password Error!");
				response.sendError(401, "Sorry UserName or Password Error!");
				logger.error("Username "+username+" or passwoord "+password+" is wrong");
				
			}
		
		
		
		//doGet(request, response);
	}

}
