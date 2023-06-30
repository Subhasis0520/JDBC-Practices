package com.jsp.visitordatamanagment.service;

import com.jsp.visitordatamanagment.dto.Admin;
import com.jsp.visitordatamanagment.repository.AdminRepositoryImp;

public class AdminServiceImp implements AdminService{

	AdminRepositoryImp aImp = null;
	{
		aImp = new AdminRepositoryImp();
	}
	public String saveAdmin(Admin admin) {	
		return aImp.saveAdmin(admin);
	}

	public boolean adminLogin(String userName, String password) {
		return aImp.adminLogin(userName, password);
	}

}
