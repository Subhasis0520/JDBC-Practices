package com.jsp.jdbcIntro.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class TestConnection {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/e4";
			String username = "root";
			String password = "Subhasis@123";
			Connection con = DriverManager.getConnection(url,username,password);
			System.out.println("Connected");
			System.out.println(con);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
