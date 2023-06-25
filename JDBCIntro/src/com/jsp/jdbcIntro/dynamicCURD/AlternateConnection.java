package com.jsp.jdbcIntro.dynamicCURD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class AlternateConnection {
   public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/e4";
		
		Properties prop = new Properties();
		prop.setProperty("user","root");
		prop.setProperty("password","Subhasis@123");
		
		Connection connection = DriverManager.getConnection(url, prop);
		System.out.println("Connected");
		
		
		connection.close();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
}
