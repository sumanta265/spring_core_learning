package com.sumanta;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	@Value("Durgapur")
   private String addname;

public String getAddname() {
	return addname;
}

public void setAddname(String addname) {
	this.addname = addname;
}
   public void show() {
	   
	   System.out.println(addname);
	   
	   
	   
   }
}
