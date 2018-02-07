package com.dealer.connection;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbConnection {
	
	private static DbConnection jdbc;
	Properties prop = new Properties();

	//private constructor
	private DbConnection() {

	}

	//creating singleton instance of DbConnection class
	public synchronized static  DbConnection getInstance() {
		if (jdbc == null) {
			jdbc = new DbConnection();
		}
		return jdbc;
	}

	//get connection method for database
	public Connection getDbInfo() throws SQLException, ClassNotFoundException {
		Connection con=null;
		InputStream input = null;
		
		input = DbConnection.class.getClassLoader().getResourceAsStream("dbconnection.properties");

		try {
			prop.load(input);
			//System.out.println(prop.getProperty("db_name"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String driver = "com.mysql.cj.jdbc.Driver";
		 Class.forName(driver);
		
		con=DriverManager.getConnection(  
					prop.getProperty("url")+prop.getProperty("db_name"),
					prop.getProperty("db_user"),
					prop.getProperty("db_pass"));
		
		return con;
	}

}
