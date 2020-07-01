package com.sumanta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
@PropertySource("classpath:application.properties")
@Component(value="x")

public class student {

	@Value("${student.name}")
	private String name;
	@Value("121")
	private int id;
	@Autowired
	Address a;
	
    


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Address getA() {
		return a;
	}

	public void setA(Address a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "student [name=" + name + ", id=" + id + "]";
	}
	
	public void show() {
		
		System.out.println(toString());
		a.show();
		
		
	}
	

	
	
	
}
