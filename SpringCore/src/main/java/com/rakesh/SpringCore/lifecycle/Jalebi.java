package com.rakesh.SpringCore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Jalebi {
	private double price;

	public Jalebi() {
		super();
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting jalebi price");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Jalebi [price=" + price + "]";
	}
	
	@PostConstruct
	public void init()
	{
		System.out.println("Taking jalebi to home - init method");
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("Eating jalebi - destroy method");
	}
}
