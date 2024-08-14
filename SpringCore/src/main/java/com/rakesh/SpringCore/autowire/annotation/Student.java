package com.rakesh.SpringCore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	private int id;
	//@Autowired        // Field Injection
	//@Qualifier("add2")
	private Address address;
	
	public Student() {
		super();
	}
	
	public Student(int id, Address address) {
		super();
		this.id = id;
		this.address = address;
	}
	
	//@Autowired                  // Constructor injection
	public Student(Address address) {
		super();
		System.out.println("Using Constructor-------");
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}
	
	@Autowired        //setter injection
	@Qualifier("add")
	public void setAddress(Address address) {
		System.out.println("Using setter------");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", address=" + address + "]";
	}
	
	
}
