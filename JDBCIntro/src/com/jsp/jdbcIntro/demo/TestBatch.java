package com.jsp.jdbcIntro.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestBatch {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/e4";
			String username = "root";
			String password = "Subhasis@123";
			Connection connection = DriverManager.getConnection(url,username,password);
			
			Statement st = connection.createStatement();			
			String insertQuery = "insert into person values(103,'Sudip',26,'sudipu@gmail.com',8597473897)";
			String updateQuery = "update person set name='Susmita' where name='Sush'";
			
			st.addBatch(insertQuery);
			st.addBatch(updateQuery);
			int[] batch = st.executeBatch();
			
			for(Integer a:batch) {
				System.out.println(a);
			}
			
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
