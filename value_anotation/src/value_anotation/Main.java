package value_anotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Main {

	
	public static void main(String args[])
	{
		ApplicationContext ac = new  ClassPathXmlApplicationContext("beans.xml"); 
		
		Employee emp= (Employee) ac.getBean("com");
		
		emp.showDetails();
	}
	
	
	
}
