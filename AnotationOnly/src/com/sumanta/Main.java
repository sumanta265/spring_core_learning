package com.sumanta;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	
	public static void main(String args[])
	{
		
		ApplicationContext context=new AnnotationConfigApplicationContext(configClass.class);
		
		Company company =context.getBean("company",Company.class);
		company.showInfo();
		company.enginner.show();
		
	}
	
	
	
}
