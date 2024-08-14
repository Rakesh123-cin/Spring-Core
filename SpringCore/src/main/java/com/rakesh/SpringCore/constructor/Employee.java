package com.rakesh.SpringCore.constructor;

import java.util.List;

public class Employee {
	private int empId;
	private Information empInfo;
	private List<String> empSkills;
	
	public Employee(int empId, Information empInfo, List<String> empSkills)
	{
		this.empId=empId;
		this.empInfo=empInfo;
		this.empSkills=empSkills;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empInfo=" + empInfo + ", empSkills=" + empSkills + "]";
	}
	

}
