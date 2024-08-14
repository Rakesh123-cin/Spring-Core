package com.rakesh.SpringCore.constructor;

public class Information {
	private String name;
	private String contact;
	private String address;
	
	public Information(String name, String contact, String address)
	{
		this.name=name;
		this.contact=contact;
		this.address=address;
	}

	@Override
	public String toString() {
		return "Information [name=" + name + ", contact=" + contact + ", address=" + address + "]";
	}
	
}
