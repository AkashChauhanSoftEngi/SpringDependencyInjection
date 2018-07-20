package com.java.spring;

import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings("rawtypes")
public class Department {

	private List departmentOne;
	private Set departmentTwo;
	private Map departmentThree;
		
	public void setDepartmentOne(List departmentOne) {
		this.departmentOne = departmentOne;
	}
	
	public void setDepartmentTwo(Set departmentTwo) {
		this.departmentTwo = departmentTwo;
	}
	
	public void setDepartmentThree(Map departmentThree) {
		this.departmentThree = departmentThree;
	}

	@Override
	public String toString() {
		return "Department [departmentOne=" + departmentOne + ", departmentTwo=" + departmentTwo + ", departmentThree="
				+ departmentThree + "]";
	}
	
}
