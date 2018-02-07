package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.dealer.connection.ExcuteQuery;

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
		
		
		if("loginform".equalsIgnoreCase(request.getParameter("login"))){
			String username = request.getParameter("userName");
			String password = request.getParameter("password");
			boolean flag = ExcuteQuery.validate(username, password);
			if (flag) {
				
				HttpSession session = request.getSession();
				session.setAttribute("user",username);
				response.sendRedirect("display.jsp");
				
			} else {
				out.print("Sorry UserName or Password Error!");
				logger.error("Username "+username+" or passwoord "+password+" is wrong");
				
			}
		}
		if("registerform".equalsIgnoreCase(request.getParameter("register"))){
			String username = request.getParameter("userName");
			String password = request.getParameter("password");

			try {
				if(ExcuteQuery.addUser(username, password)==1)
					out.print("Successfully Register");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//doGet(request, response);
	}

}
