package com.jsp.visitordatamanagment.service;

import java.sql.Date;
import java.util.List;

import com.jsp.visitordatamanagment.dto.Visitor;
import com.jsp.visitordatamanagment.repository.VisitorRepository;
import com.jsp.visitordatamanagment.repository.VisitorRepositoryImp;

public class VisitorServiceImp implements VisitorService{
	VisitorRepository vr = null;
	{
		vr = new VisitorRepositoryImp();
	}

	public String saveVisitor(Visitor visitor) {
		return vr.saveVisitor(visitor);
	}

	public String updateVisitor(Visitor visitor) {
		return vr.updateVisitor(visitor);
	}

	public Visitor getVisitorById(int id) {
		Visitor visitor = vr.getVisitorById(id);
		return visitor;
	}

	public Visitor getVisitorByPhone(String phone) {		
		return vr.getVisitorByPhone(phone);
	}

	public Visitor getVisitorByEmail(String email) {
		return vr.getVisitorByEmail(email);
	}

	public List<Visitor> getAllVisitors() {
		List<Visitor> allVisitors = vr.getAllVisitors();
		return allVisitors;
	}

	public List<Visitor> getVisitorsByVisitingDate(Date date) {
		return vr.getVisitorsByVisitingDate(date);
	}

	public String deleteVisitorById(int id) {
		return vr.deleteVisitorById(id);
	}

}
