package com.dealer.connection;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class ExcuteQuery {
	final static Logger logger = LogManager.getLogger(ExcuteQuery.class);

	public static ResultSet displayCar() throws SQLException, ClassNotFoundException {
		
		DbConnection dbInstance = DbConnection.getInstance();
		Connection con = dbInstance.getDbInfo();

		PreparedStatement ps = con.prepareStatement(
			"SELECT car_model.model_name,car_model.company,car.color,car.type,car.year,car_model.price,car.carID "
			+ "FROM car "
			+ "INNER JOIN car_model on car.model_id=car_model.model_id;");

		ResultSet rs = ps.executeQuery();
		
		return rs;
	}

	public static boolean validate(String name, String pass) {
		boolean status = false;
		//int password = pass.hashCode();
		DbConnection dbInstance = DbConnection.getInstance();

		try {

			Connection con = dbInstance.getDbInfo();

			PreparedStatement ps = con.prepareStatement("select * from login where username=? and password=?");
			ps.setString(1, name);
			ps.setString(2, pass);

			ResultSet rs = ps.executeQuery();
			status = rs.next();

		} catch (Exception e) {
			System.out.println(e);
		}
		return status;

	}
	
	public static int addUser(String name, String pass) throws ClassNotFoundException, SQLException{
		int status=0;
		//int password = pass.hashCode();
		DbConnection dbInstance = DbConnection.getInstance();
		Connection con = dbInstance.getDbInfo();

		PreparedStatement ps = con.prepareStatement(
			"INSERT INTO login(username,password,isadmin) values(?,?,0)");
		ps.setString(1, name);
		ps.setString(2, pass);

		
		//ps.executeQuery();
		status=ps.executeUpdate();
		
		
		return status;
		
	}
	
	public static boolean isAdmin(String name) {
		boolean status = false;
		int a=0;
		DbConnection dbInstance = DbConnection.getInstance();

		try {

			Connection con = dbInstance.getDbInfo();

			PreparedStatement ps = con.prepareStatement("select isadmin from login where username=?");
			ps.setString(1, name);

			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				a = rs.getInt("isadmin");
			}
			if(a==0){
				status=false;
			}
			else{
				status=true;
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return status;

	}
	
	public static int delete(int id) throws SQLException, ClassNotFoundException {
		int status=0;
		DbConnection dbInstance = DbConnection.getInstance();

		

			Connection con = dbInstance.getDbInfo();

			PreparedStatement ps = con.prepareStatement("delete from car where carID=?");
			ps.setInt(1, id);

			status=ps.executeUpdate();
			return status;

	}

}
