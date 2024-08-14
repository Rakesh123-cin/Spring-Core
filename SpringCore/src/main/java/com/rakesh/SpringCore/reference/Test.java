package com.rakesh.SpringCore.reference;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class Test {
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("refconfig.xml");
		A obj = (A) context.getBean("aref");
		System.out.println(obj);
	}
}
