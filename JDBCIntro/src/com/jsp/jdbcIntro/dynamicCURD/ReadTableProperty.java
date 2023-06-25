package com.jsp.jdbcIntro.dynamicCURD;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class ReadTableProperty {
 
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/e4";
			FileInputStream fis = new FileInputStream("mydbinfo.properties");
	        
			Properties prop = new Properties();
			prop.load(fis);
			Connection connection = DriverManager.getConnection(url, prop);
			
			String query = "select * from person";
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(query);
			System.out.println(rs.isBeforeFirst());
			
			ResultSetMetaData metaData = rs.getMetaData();
			int count = metaData.getColumnCount();
			while(rs.next()) {
				for(int i=1;i<=count;i++)
				System.out.println(metaData.getColumnName(i)+" --> "+rs.getObject(i));
				System.out.println("--------------");
			}
			
			System.out.println("connected");
			
			rs.close();
			statement.close();
			connection.close();
			
		} catch (ClassNotFoundException | FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
