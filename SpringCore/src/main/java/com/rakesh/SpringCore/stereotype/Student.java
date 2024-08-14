package com.rakesh.SpringCore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("student")
@Scope("prototype")
public class Student {
	
	@Value("Rakesh Anand")
	private String name;
	
	@Value("Darbhanga")
	private String city;
	
	@Value("#{skills}")
	private List<String> skills;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + ", skills=" + skills + "]";
	}
	
	

}
