package value_anotation;

import org.springframework.beans.factory.annotation.Value;

public class Employee {
	
	
	@Value("${emp.name}")//direct use of value annotation
	String name;
	@Value("${emp.id}")
	int id;
	@Value("${emp.dept}")
	String dept;
	
	
	
	
//	@Value("${emp.name}")
//	public void setName (String name)
//	{
//		
//		this.name=name;
//		
//		
//	}
 
//	@Value("${emp.id}")
//	public void setId(int id)
//	{
//		
//		this.id=id;
//		
//		
//	}
//	@Value("${emp.dept}")
//	public void setName (String dept)
//	{
//		
//		this.dept=dept;
//		
//		
//	}
	public void showDetails()
	{
		
		System.out.println("Employee Name Is:  "+name);
		System.out.println("Employee id Is:  "+id);
		System.out.println("Employee dept Is:  "+dept);
	}
	
	
	
	
	
	
	
	
	
	
}
