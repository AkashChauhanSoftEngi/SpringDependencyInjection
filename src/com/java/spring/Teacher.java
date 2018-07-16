package com.java.spring;

public class Teacher {

	public String gender;
	
	/*Setting by XML*/
	private Teacher(String gender){
		this.gender = gender;
	}
	
	public void displayInfo(String name) {
		System.out.println("Name: " + name + ", Gender: " + gender);
	}

}
