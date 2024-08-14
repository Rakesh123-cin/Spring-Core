package com.rakesh.SpringCore.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("constconfig.xml");
//		Employee e1 = (Employee)context.getBean("emp");
//		System.out.println(e1);
		
		Addition a = (Addition) context.getBean("add");
		a.sum();
	}
}
