package com.rakesh.SpringCore.collections.standalone;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Institute {
	private List<String> courses;
	private Map<String,Float> feeStructure;
	private Properties props;
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	public Map<String, Float> getFeeStructure() {
		return feeStructure;
	}
	public void setFeeStructure(Map<String, Float> feeStructure) {
		this.feeStructure = feeStructure;
	}
	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	@Override
	public String toString() {
		return "Institute [courses=" + courses + ", feeStructure=" + feeStructure + ", props=" + props + "]";
	}
	
	
}
