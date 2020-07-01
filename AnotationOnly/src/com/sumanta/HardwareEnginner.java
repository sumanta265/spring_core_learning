package com.sumanta;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class HardwareEnginner implements Engineer {

	public void show() {
		
		
		System.out.println("Hardware Engineer");
	}
	
	
}
