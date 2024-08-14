package com.rakesh.SpringCore.autowire.annotation;

public class Address {
	private String state;
	private String district;
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	@Override
	public String toString() {
		return "Address [state=" + state + ", district=" + district + "]";
	}
	
}
