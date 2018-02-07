package com.dealer.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;

public class ExcuteQuery {
	static Statement statement = null;
	
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		//Statement statement = null;
		DbConnection db = DbConnection.getInstance();
		db.getDbInfo();
		String driver = "com.mysql.cj.jdbc.Driver";
		 Class.forName(driver).newInstance();
		
			Connection con=DriverManager.getConnection(  
					db.prop.getProperty("url")+db.prop.getProperty("db_name"),
					db.prop.getProperty("db_user"),
					db.prop.getProperty("db_pass"));
			statement = con.createStatement();
		 
		
		
		String query = "select * from customer";
		query(query);
	}

	public static void query(String query){
		try {
			ResultSet res = statement.executeQuery(query);
			res.absolute(1);
			System.out.println(res.getString(1)+" "+res.getString(2)+" "+res.getString(3)); 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}
