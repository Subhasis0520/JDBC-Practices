package com.jsp.visitordatamanagment.test;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

import com.jsp.visitordatamanagment.dto.Visitor;
import com.jsp.visitordatamanagment.service.AdminServiceImp;
import com.jsp.visitordatamanagment.service.VisitorServiceImp;

public class MyApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AdminServiceImp admin = new AdminServiceImp();
		VisitorServiceImp visitor = new VisitorServiceImp();
		
		System.out.println("enter the admin Name");
		String name = sc.nextLine();
		System.out.println("enter the password");
		String pass = sc.nextLine();
		
		if(admin.adminLogin(name, pass)) {
			System.out.println("Press 1 for add visitor data");
			System.out.println("Press 2 for update the visitor data");
			System.out.println("Press 3 for get visitor data by ID");
			System.out.println("Press 4 for get visitor data by phone");
			System.out.println("Press 5 for get visitor data by EMAIL");
			System.out.println("Press 6 for get all visitor data");
			System.out.println("Press 7 for get visitor data by DateOfEntry");
			System.out.println("Press 8 for delete visitor data");
			System.out.println("Press 0 to exit");
			System.out.println("***************");
			System.out.println();
			
			System.out.println("Enter the choice");
			int choice = sc.nextInt();
		
			switch(choice) {
			 case 1:
				 System.out.println("enter the name:- ");
				 String n = sc.next();
				
				 System.out.println("enter the mail:- ");
				 String m = sc.next();
				
				 System.out.print("enter the phone number:- ");
				 String ph = sc.next();
				 
				 java.util.Date d = new java.util.Date();
				 Date date = new Date(d.getTime());
				 Visitor v1 = new Visitor(n,m,date,ph);
				 System.out.println(visitor.saveVisitor(v1));
				 break;
				 
			 case 2:
				 System.out.print("enter the name:- ");
				 String n1 = sc.next();
				 System.out.print("enter the mail:- ");
				 String m1 = sc.next();
				 System.out.print("enter the phone number:-");
				 String ph1 = sc.next();
				 @SuppressWarnings("deprecation")
				 Date date1 = new Date(0, 0, 0);
				 Visitor v2 = new Visitor(n1,m1,date1,ph1);
				 System.out.println(visitor.updateVisitor(v2));
				 break;
				 
			 case 3:
				 System.out.print("enter the id:- ");
				 int id = sc.nextInt();
				 System.out.println(visitor.getVisitorById(id));
				 break;
				 
			 case 4:
				 System.out.println("enter phone number:- ");
				 String ph2 = sc.nextLine();
				 System.out.println(visitor.getVisitorByPhone(ph2));
				 break;
				 
				 
			 case 5:
				 System.out.println("enter the mail:-");
				 String em = sc.next();
				 System.out.println(visitor.getVisitorByEmail(em));
				 break;
				 
				 
			 case 6:
				 List<Visitor> list = visitor.getAllVisitors();
				 for(Visitor v:list) {
					 System.out.println(v);
				 }
				 break;
				 
				 
			 case 7:
				 System.out.print("enter year");int y = sc.nextInt();
				 System.out.print("enter month");int mon = sc.nextInt();
				 System.out.print("enter day");int da = sc.nextInt();
				 java.util.Date day = new java.util.Date(y, mon, da);
				 Date date3 = new Date(day.getTime());
				 List<Visitor> list2 = visitor.getVisitorsByVisitingDate(date3);
				 for(Visitor vi:list2) {
					 System.out.println(vi);
				 }
				 break;
				 
				 
			 case 8:
				 System.out.print("enter the id:- ");
				 int id2 = sc.nextInt();
				 System.out.println(visitor.deleteVisitorById(id2));
				 break;
				 
		     default:
		    	 System.out.println("Invalid choice");
		    	 System.out.println("Try again....!");
					 
			}
			
			
		}else {
			System.out.println("Wrong name or Password");
			System.out.println("Try with valid one");
			System.out.println("Thank you visit again");
		}
	}
}
