package com.java.spring;

public class Teacher {

	public String gender;
	public int age;
	public String email;
	
	/*Setting by XML*/
	private Teacher(String gender, int age, String email){
		this.gender = gender;
		this.age = age;
		this.email = email;
	}
	
	public void displayInfo(String name) {
		System.out.println("Name: " + name + ", Gender: " + gender + ", Age: " + age + ", Email: " + email);
	}

}
