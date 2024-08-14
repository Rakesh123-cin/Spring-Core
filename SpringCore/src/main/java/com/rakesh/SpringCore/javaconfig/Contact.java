package com.rakesh.SpringCore.javaconfig;

public class Contact {
	private String address;
	private String mobileNo;
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	@Override
	public String toString() {
		return "Contact [address=" + address + ", mobileNo=" + mobileNo + "]";
	}

	
}
