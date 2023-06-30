package com.jsp.visitordatamanagment.repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.jsp.visitordatamanagment.dto.Visitor;
import com.jsp.visitordatamanagment.util.AppContants;
import com.jsp.visitordatamanagment.util.ConnectionUtil;

public class VisitorRepositoryImp implements VisitorRepository{

	public String saveVisitor(Visitor visitor) {
		try {
		Connection con = ConnectionUtil.getConnection();
		String query = "INSERT INTO visitor(name,email,visited_date,phone) VALUES (?,?,?,?)";		
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, visitor.getName());
			ps.setString(2, visitor.getEmail());
			ps.setDate(3, visitor.getVisitedDate());
			ps.setString(4, visitor.getPhone());
			
			ps.executeUpdate();
			con.close();
			return AppContants.SUCESS_MESSAGE;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return AppContants.ERROR_MESSAGE;
	}

	public String updateVisitor(Visitor visitor) {
		
		try {
		Connection connection = ConnectionUtil.getConnection();
		String updateQuery = "UPDATE visitor set name=?,email=?,visited_date=? where phone=?";
		PreparedStatement ps = connection.prepareStatement(updateQuery);
		ps.setString(1, visitor.getName());
		ps.setString(2, visitor.getEmail());
		ps.setDate(3, visitor.getVisitedDate());
		ps.setString(4, visitor.getPhone());
		return AppContants.SUCESS_MESSAGE;
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return AppContants.ERROR_MESSAGE;
	}

	public Visitor getVisitorById(int id) {
		Visitor visitor =null;
		try {
			Connection connection = ConnectionUtil.getConnection();
			String updateQuery = "select * from visitor where id=?";
			PreparedStatement ps = connection.prepareStatement(updateQuery);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
			visitor = new Visitor();
			visitor.setId(rs.getInt("id"));
			visitor.setName(rs.getString(2));
			visitor.setEmail(rs.getString(3));
			visitor.setVisitedDate(rs.getDate(4));
			visitor.setPhone(rs.getString(5));
			
			}
			connection.close();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		return visitor;
	}

	public Visitor getVisitorByPhone(String phone) {
		Visitor visitor =null;
		try {
			Connection connection = ConnectionUtil.getConnection();
			String updateQuery = "select * from visitor where phone=?";
			PreparedStatement ps = connection.prepareStatement(updateQuery);
			ps.setString(1, phone);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
			visitor = new Visitor();
			visitor.setId(rs.getInt("id"));
			visitor.setName(rs.getString(2));
			visitor.setEmail(rs.getString(3));
			visitor.setVisitedDate(rs.getDate(4));
			visitor.setPhone(rs.getString(5));
			
			}
			connection.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return visitor;
	}

	public Visitor getVisitorByEmail(String email) {
		Visitor visitor =null;
		try {
			Connection connection = ConnectionUtil.getConnection();
			String updateQuery = "select * from visitor where email=?";
			PreparedStatement ps = connection.prepareStatement(updateQuery);
			ps.setString(1, email);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
			visitor = new Visitor();
			visitor.setId(rs.getInt("id"));
			visitor.setName(rs.getString(2));
			visitor.setEmail(rs.getString(3));
			visitor.setVisitedDate(rs.getDate(4));
			visitor.setPhone(rs.getString(5));
			
			}
			connection.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return visitor;
	}

	public List<Visitor> getAllVisitors() {
		List<Visitor> list=null;
		String query ="select * from visitor";
		try {
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement ps = connection.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		if(rs.isBeforeFirst()) {
			list = new ArrayList<Visitor>();
			while(rs.next()) {
				Visitor visitor = new Visitor();
				visitor.setId(rs.getInt("id"));
				visitor.setName(rs.getString(2));
				visitor.setEmail(rs.getString(3));
				visitor.setVisitedDate(rs.getDate(4));
				visitor.setPhone(rs.getString(5));
				
				list.add(visitor);
			}
			
		}
		connection.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public List<Visitor> getVisitorsByVisitingDate(Date date) {
		List<Visitor> list=null;
		String query ="select * from visitor where visited_date=?";
		try {
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setDate(1, date);
		ResultSet rs = ps.executeQuery();
		if(rs.isBeforeFirst()) {
			list = new ArrayList<Visitor>();
			while(rs.next()) {
				Visitor visitor = new Visitor();
				visitor.setId(rs.getInt("id"));
				visitor.setName(rs.getString(2));
				visitor.setEmail(rs.getString(3));
				visitor.setVisitedDate(rs.getDate(4));
				visitor.setPhone(rs.getString(5));
				
				list.add(visitor);
			}
			
		}
		connection.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public String deleteVisitorById(int id) {
	    Connection connection = ConnectionUtil.getConnection();
		 PreparedStatement ps;
		try {
			ps = connection.prepareStatement("delete from visitor where id = ?");
			ps.setInt(1, id);		
			ps.executeUpdate();
			return AppContants.SUCESS_MESSAGE;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return AppContants.ERROR_MESSAGE;
	}

}
