package com.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Company {
	
	@Autowired
	@Qualifier("dept1")
	department dept;
	
//	public Company(HRDept dept)//using constructor
//	{
//	this.dept=dept;	
//	System.out.println("constructor is running");
//	}
	
//	public void setCompany(HRDept dept)
//	{
//		
//		this.dept=dept;	
//		System.out.println("setter method is running");	
//	}
//	
	
	public void companywork() {
		
		
		dept.work();
		
	}
	
	
	
	
	
	
	
	
	
}
