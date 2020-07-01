package com.sumanta;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SoftwareEnginner implements Engineer {

	
	public void show()
	{
		
		System.out.println("Software developer");
		
	}
}
