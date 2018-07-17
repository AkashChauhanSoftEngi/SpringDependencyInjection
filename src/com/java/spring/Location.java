package com.java.spring;

public class Location {
	private String street;
	private String zipCode;
	
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	public String getStreet() {
		return street;
	}
	
	public String getZipCode() {
		return zipCode;
	}

}
