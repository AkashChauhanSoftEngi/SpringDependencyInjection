package com.java.spring;

public class Student {
	public String gender;
	
	/*Setting value by XML*/
	public void setGender(String gender) {
		this.gender = gender;
	}

	public void displayInfo(String name) {
		System.out.println("Name: " + name + ", Gender: " + gender);
	}
}
