package com.rakesh.SpringCore.collections.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/rakesh/SpringCore/collections/standalone/config.xml");
		Institute ins = context.getBean("institute",Institute.class);
		System.out.println(ins);
		System.out.println(ins.getCourses().getClass().getName());
		System.out.println(ins.getFeeStructure().getClass().getName());
	}
}
