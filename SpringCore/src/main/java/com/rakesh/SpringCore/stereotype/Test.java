package com.rakesh.SpringCore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/rakesh/SpringCore/stereotype/stereoconfig.xml");
		Student s1 = context.getBean(Student.class);
		System.out.println(s1);
		
		Student s2 = context.getBean("student",Student.class);
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}

}
