package com.jsp.jdbcIntro.dynamicCURD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class TestMultiInsert {

	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/e4";
		String username = "root";
		String password = "Subhasis@123";
		Connection connection = DriverManager.getConnection(url,username,password);
		
		String query= "INSERT INTO person VALUES (?,?,?,?,?)";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setInt(1, 80);
		ps.setString(2, "Laxmi");
		ps.setInt(3, 40);
		ps.setString(4,"laxmi@gmail.com");
		ps.setInt(5, 99652578);
		ps.addBatch();
		
		ps.setInt(1, 91);
		ps.setString(2, "Anup");
		ps.setInt(3, 19);
		ps.setString(4,"anup@gmail.com");
		ps.setInt(5, 78453245);
		ps.addBatch();
		
		ps.setInt(1, 97);
		ps.setString(2, "Deba");
		ps.setInt(3, 46);
		ps.setString(4,"montu@gmail.com");
		ps.setInt(5,73195148);
		ps.addBatch();
		
		int[] batch = ps.executeBatch();
		for(Integer n: batch)
			System.out.println(n);
		
		
		}catch (SQLException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
