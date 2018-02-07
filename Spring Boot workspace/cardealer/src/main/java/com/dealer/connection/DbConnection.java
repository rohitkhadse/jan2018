package com.dealer.connection;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DbConnection {
	
	private static DbConnection jdbc;
	Properties prop = new Properties();
	//Connection con;

	private DbConnection() {

	}

	//creating singleton instance of DbConnection class
	public synchronized static  DbConnection getInstance() {
		if (jdbc == null) {
			jdbc = new DbConnection();
		}
		return jdbc;
	}

	public void getDbInfo() {
		
		InputStream input = null;
		DbConnection.class.getClassLoader();
		input = ClassLoader.getSystemResourceAsStream("dbconnection.properties");

		try {
			prop.load(input);
			//System.out.println(prop.getProperty("db_name"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
