package com.java.spring;

import java.lang.reflect.InvocationTargetException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * Dependency Injection using Setter and constructor, 
 * check XML file how to pass values to setters and constructors
 * 
 * */

public class Test {
	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		String[] files = new String[]{"resources/applicationContextOne.xml","resources/applicationContextTwo.xml"};
		ApplicationContext ap = new ClassPathXmlApplicationContext(files);

		/* DI using Setter method*/
		Student student = (Student) ap.getBean("studentbean");
		student.displayInfo("Ajay Dev");
		
		/* DI using Constructor*/
		Teacher teacher = (Teacher) ap.getBean("teacherBean");
		teacher.displayInfo("Shivani Raj");
		
		/*Secondary Data type D-Injection*/
		School school = (School) ap.getBean("schoolbean");
		school.displayInfo();
		
		/*Primitive Array[] D-Injection*/
		Location location = (Location) ap.getBean("locationbean");
		location.displayinfo();
		
		/*Collection Injection*/
		Department department = (Department) ap.getBean("departmentbean");
		System.out.println(department.toString());
	}
}
