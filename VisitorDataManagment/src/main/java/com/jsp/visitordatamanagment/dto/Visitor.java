package com.jsp.visitordatamanagment.dto;

import java.sql.Date;

public class Visitor {

	private Integer id;
	private String name;
	private String email;
	private Date visitedDate;
	private String phone;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getVisitedDate() {
		return visitedDate;
	}
	public void setVisitedDate(Date visitedDate) {
		this.visitedDate = visitedDate;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Visitor( String name, String email, Date visitedDate, String phone) {
		super();
		this.name = name;
		this.email = email;
		this.visitedDate = visitedDate;
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Visitor [id=" + id + ", name=" + name + ", email=" + email + ", visitedDate=" + visitedDate + ", phone="
				+ phone + "]";
	}
	public Visitor() {
		super();
	}
	
	
	
}
