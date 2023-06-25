package com.jsp.jdbcIntro.dynamicCURD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestUpdate {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection
			("jdbc:mysql://localhost:3306/e4?user=root&password=Subhasis@123");
			
			String query="update person set name=?,age=?,email=?,mobile=? where id=?";
			PreparedStatement ps = connection.prepareStatement(query);
		    System.out.println("connected");
			 ps.setString(1, "Sush");
			 ps.setInt(2,22);
			 ps.setString(3,"sush@gmail.com");
			 ps.setInt(4,938269785);
			 ps.setInt(5, 205);
			 int res = ps.executeUpdate();
			 System.out.println(res);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
