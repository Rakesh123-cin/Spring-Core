package com.rakesh.SpringCore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/rakesh/SpringCore/lifecycle/config.xml");
		//register shutdown hook.
		context.registerShutdownHook();
		
		Samosa s = (Samosa) context.getBean("s1");
		System.out.println(s);
		
		Pepsi p = (Pepsi) context.getBean("p1");
		System.out.println(p);
		
		Jalebi j = (Jalebi) context.getBean("j1");
		System.out.println(j);
	}

}
