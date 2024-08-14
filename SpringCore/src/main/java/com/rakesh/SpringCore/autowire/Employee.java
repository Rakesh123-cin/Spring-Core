package com.rakesh.SpringCore.autowire;

public class Employee {
	private int id;
	private Address address;
	
	public Employee() {
		super();
	}

	public Employee(int id, Address address) {
		System.out.println("Using constructor----");
		this.id = id;
		this.address = address;
	}
	
	public Employee(Address address) {
		System.out.println("Using constructor to inject address -----");
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("setting Id-------");
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("setting address-------");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", address=" + address + "]";
	}
	
	
}
