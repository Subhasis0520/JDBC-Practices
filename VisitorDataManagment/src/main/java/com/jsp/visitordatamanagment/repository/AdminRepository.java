package com.jsp.visitordatamanagment.repository;

import com.jsp.visitordatamanagment.dto.Admin;

public interface AdminRepository {

	public String saveAdmin(Admin admin);
	public boolean adminLogin(String userName, String password);
	
}
