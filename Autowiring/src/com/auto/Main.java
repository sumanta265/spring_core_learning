package com.auto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	
	
	public static void main(String args[])
	{
		ApplicationContext ac = new  ClassPathXmlApplicationContext("beans.xml"); 
		
		Company company= (Company) ac.getBean("com");
		
		company.companywork();
	}
	
	
	
	
}
