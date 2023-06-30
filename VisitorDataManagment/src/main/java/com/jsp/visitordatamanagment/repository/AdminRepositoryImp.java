package com.jsp.visitordatamanagment.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jsp.visitordatamanagment.dto.Admin;
import com.jsp.visitordatamanagment.util.AppContants;
import com.jsp.visitordatamanagment.util.ConnectionUtil;

public class AdminRepositoryImp implements AdminRepository{

	public String saveAdmin(Admin admin) {
			
		try {
			Connection con = ConnectionUtil.getConnection();
			String query = "insert into admin(name,password) values(?,?)";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, admin.getName());
			ps.setString(2,admin.getPassword());
			
		    ps.executeUpdate();
			
			con.close();
			return AppContants.SUCESS_MESSAGE;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return AppContants.ERROR_MESSAGE;
	}

	public boolean adminLogin(String userName, String password) {

		try {
			Connection con = ConnectionUtil.getConnection();
			String query= "select * from admin where name = ? && password=?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, userName);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			
			boolean b = rs.next();
			
			return b;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}

}
