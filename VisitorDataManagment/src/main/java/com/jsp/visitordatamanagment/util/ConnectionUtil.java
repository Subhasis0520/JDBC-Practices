package com.jsp.visitordatamanagment.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

	
	public static Connection getConnection() {
       try {
		Class.forName(AppContants.DRIVER_NAME);
		Connection connection = DriverManager.getConnection(AppContants.URL, AppContants.USER_NAME,AppContants.PASSWORD);
	    
		return connection;
       } catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	}
       return null;
	}
}
