package com.jsp.jdbcIntro.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestInsert {

	public static void main(String[] args) {
		try {
			//1.load and register the Drive
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2.establish the connection
			String url = "jdbc:mysql://localhost:3306/e4";
			String username = "root";
			String password = "Subhasis@123";
			Connection connection = DriverManager.getConnection(url,username,password);
			
			//3.create a statement
			Statement st = connection.createStatement();
			
			String query = "insert into person values(103,'Sudip',26,'sudipu@gmail.com',8597473897)";
			
			//4.execute the statement
			boolean res = st.execute(query);
			System.out.println(res);
			
			//6.Close the connection
			connection.close();
			System.out.println("connected");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
