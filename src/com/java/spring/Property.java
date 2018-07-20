package com.java.spring;

import java.util.Properties;
import java.util.Set;

public class Property {
	private Properties driver;
	
	public void setDriver(Properties driver) {
		this.driver = driver;
	}
	
	@SuppressWarnings("rawtypes")
	public void printPropertyData(){
		Set keys = driver.keySet();
		for(Object key:keys){
			System.out.println(key + ":" + driver.getProperty(key.toString()));
		}
	}
}
