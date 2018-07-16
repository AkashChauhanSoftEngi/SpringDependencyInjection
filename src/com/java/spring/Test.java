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

		ApplicationContext ap = new ClassPathXmlApplicationContext("applicationContext.xml");

		/* DI using setter method and pass value by XML*/
		Student student = (Student) ap.getBean("studentbean");
		student.displayInfo("Ajay Dev");
		
		/* DI using constructor and pass value by XML*/
		Teacher teacher = (Teacher) ap.getBean("teacherBean");
		teacher.displayInfo("Shivani Raj");
	}
}
