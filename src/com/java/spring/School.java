package com.java.spring;

public class School {
	private String name;
	private Location location;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setLocation(Location location) {
		this.location = location;
	}
	
	public void displayInfo(){
		System.out.println("School Name: " + name + ", Address: " + location.getStreet() + ", " + location.getZipCode());
	}
}
