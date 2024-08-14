package com.rakesh.SpringCore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test2 {
	public static void main(String[] args)
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig2.class);
		Student s = context.getBean("student",Student.class);
		System.out.println(s);
	}
}
