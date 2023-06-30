package com.jsp.visitordatamanagment.repository;

import java.sql.Date;
import java.util.List;

import com.jsp.visitordatamanagment.dto.Visitor;

public interface VisitorRepository {

	public String saveVisitor(Visitor visitor);

	public String updateVisitor(Visitor visitor);

	public Visitor getVisitorById(int id);

	public Visitor getVisitorByPhone(String phone);

	public Visitor getVisitorByEmail(String email);

	public List<Visitor> getAllVisitors();

	public List<Visitor> getVisitorsByVisitingDate(Date date);

	public String deleteVisitorById(int id);
	
}
