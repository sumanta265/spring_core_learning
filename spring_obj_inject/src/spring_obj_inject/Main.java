package spring_obj_inject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

public static void main(String args[])
	{
		
		ApplicationContext ac = new  ClassPathXmlApplicationContext("beans.xml"); 
		
		school s1 =  (school) ac.getBean("school1");
		s1.show();
		
		
		college c1 = (college) ac.getBean("college1");
		c1.show();
		
		
	}
	
	
	
	
	
	
	
	
	
}
