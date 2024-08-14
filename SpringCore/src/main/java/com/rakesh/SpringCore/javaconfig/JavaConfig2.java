package com.rakesh.SpringCore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class JavaConfig2 {
	
	@Bean
	public Contact getContact()
	{
		Contact c = new Contact();
		c.setAddress("Darbhanga");
		c.setMobileNo("7209921762");
		return c;
	}
	
	@Bean(name= {"student"})
	@Scope("prototype")
	public Student getStudent()
	{
		Student s = new Student();
		s.setRollNo(27);
		s.setContact(getContact());
		s.setName("Rakesh Anand");
		return s;
	}
}
