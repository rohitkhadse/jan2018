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
			"SELECT car_model.model_name,car_model.company,car.color,car.type,car.year,car_model.price "
			+ "FROM car "
			+ "INNER JOIN car_model on car.model_id=car_model.model_id;");

		ResultSet rs = ps.executeQuery();
		
		return rs;
	}

	public static boolean validate(String name, String pass) {
		boolean status = false;
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

}
