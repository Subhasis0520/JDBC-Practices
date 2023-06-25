package com.jsp.jdbcIntro.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class TestSelect {

	public static void main(String[] args) {
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			String url ="jdbc:mysql://localhost:3306/e4";
			String username = "root";
			String password = "Subhasis@123";
			Connection connection = DriverManager.getConnection(url, username, password);
			Statement statement = connection.createStatement();
			String query = "select * from person";
			boolean res = statement.execute(query);
			
			//5.Process the data
			ResultSet rs = statement.getResultSet();
			while(rs.next()) {
		    System.out.println(rs.getInt(1));
		    System.out.println(rs.getString(2));
		    System.out.println(rs.getString(3));
		    System.out.println(rs.getString(4));
		    System.out.println(rs.getString(5));
		    System.out.println("****************");
			}
			System.out.println(rs);
			System.out.println(res);
			
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
