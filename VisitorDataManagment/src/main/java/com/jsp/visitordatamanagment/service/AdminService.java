package com.jsp.visitordatamanagment.service;

import com.jsp.visitordatamanagment.dto.Admin;

public interface AdminService {

	public String saveAdmin(Admin admin);
	
	public boolean adminLogin(String userName, String password);
}
