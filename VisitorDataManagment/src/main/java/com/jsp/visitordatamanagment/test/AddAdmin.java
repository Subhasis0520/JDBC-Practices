package com.jsp.visitordatamanagment.test;

import java.util.Scanner;

import com.jsp.visitordatamanagment.dto.Admin;
import com.jsp.visitordatamanagment.service.AdminServiceImp;

public class AddAdmin {

	public static void main(String[] args) {
		 AdminServiceImp imp = new AdminServiceImp();
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter the admin name");
		 String name = sc.nextLine();
		 System.out.println("enter the password");
		 String pass = sc.nextLine();
		 
		 Admin admin = new Admin();
		 admin.setName(name);
		 admin.setPassword(pass);
		 
		 System.out.println(imp.saveAdmin(admin));
		 
	}
}
