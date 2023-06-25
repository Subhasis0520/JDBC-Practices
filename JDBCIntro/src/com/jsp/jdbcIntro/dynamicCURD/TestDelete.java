package com.jsp.jdbcIntro.dynamicCURD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestDelete {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/e4?user=root&password=Subhasis@123");
			String query = "delete from person where id=?";
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setInt(1,102);
			int res = ps.executeUpdate();
			System.out.println(res+" row is deleted");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
}
