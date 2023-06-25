package com.jsp.jdbcIntro.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestUpdate {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/e4";
			String username = "root";
			String password = "Subhasis@123";
			Connection connection = DriverManager.getConnection(url, username, password);
		    Statement st = connection.createStatement();
		    String query = "update person set name='Rajesh',mobile='7319420031' where id=102";
		    int count = st.executeUpdate(query);
		    System.out.println(count);
		    ResultSet set = st.getResultSet();
		    System.out.println(set);
		    connection.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

}
