package spring_jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
public static void main(String args[])
{
	ApplicationContext ac = new  ClassPathXmlApplicationContext("beans.xml"); 
	
	connectDao x = (connectDao) ac.getBean("d");
	int s=x.saveStudent(new student(120,"adkfk","durgapur"));
	System.out.println(s);
	
	
}
	
	
	
	
	
	
}

