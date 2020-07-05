package spring_d_inject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
public static void main(String args[])
{
	ApplicationContext ac = new  ClassPathXmlApplicationContext("beans.xml"); 
	
	demo x = (demo) ac.getBean("d");
	x.show();
	
}
	
	
	
	
	
	
}
