package com.sumanta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Company {
   @Autowired
	Engineer enginner;
	
//	public void setEngineer(Engineer enginner) {
//		this.enginner = enginner;
//	}
	public void showInfo()
	{
		
		System.out.println("hello details  ??");
		
		
	}
	
	
	
}
