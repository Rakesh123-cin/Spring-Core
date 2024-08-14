package com.rakesh.SpringCore.lifecycle;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.DisposableBean;

public class Pepsi implements InitializingBean, DisposableBean{
	private double price;

	public Pepsi() {
		super();
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting pepsi price");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Take pepesi to home - init method");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Return pepsi bottle to shop - destroy method");
	}
	
}
