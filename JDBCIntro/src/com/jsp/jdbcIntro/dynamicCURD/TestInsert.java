package com.jsp.jdbcIntro.dynamicCURD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class TestInsert {
   
	public static void main(String[] args) {
		
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			String url="jdbc:mysql://localhost:3306/e4?user=root&password=Subhasis@123";
			Connection connection = DriverManager.getConnection(url);
			
			String query = "insert into person values(?,?,?,?,?)";
			PreparedStatement ps = connection.prepareStatement(query);
		    ps.setInt(1,205);
		    ps.setString(2,"Anup");
		    ps.setInt(3,23);
		    ps.setString(4,"anup@gmail.com");
		    ps.setInt(5,964582134);
		    
		    int res = ps.executeUpdate();
		    System.out.println(res);		    
		    connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
