package com.rakesh.SpringCore.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/rakesh/SpringCore/autowire/annotation/config.xml");
		Student s1 = context.getBean("stud",Student.class);
		System.out.println(s1);
	}

}
