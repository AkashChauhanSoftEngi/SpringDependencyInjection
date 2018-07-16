# SpringDependencyInjection

* Spring 3 + J2EE (J2EE Container) + DI using setter and constructor, Example
* Dependency Injection using Setter and constructor, check XML file how to pass values to setters and constructors
* Pass values through XML file to java classes
* Used ApplicationContext Interface, and used ClassPathXmlApplicationContext Implementation class
* Used applicationContext.xml for defining beans
* Spring requires Spring JAR/Libraries and JDK Libraries to run an Spring based application 
* We need a driver class [ClassPathXmlApplicationContext] to run Spring container[IOC], which implements ApplicationContext Interface

* DI using setter
```xml
 	<bean id="studentbean" class="com.java.spring.Student">  
    		<property name="name" value="Vimal Jaiswal"></property>  
  	</bean>
```
* DI using constructor
```xml
  <bean id="teacherBean" class="com.java.spring.Teacher" scope="singleton">
	  	<constructor-arg value="female">
	  	</constructor-arg>
	</bean>
```

* J2EE IOC
```java
	ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");
```

> **###1. Technologies**
* Spring 3.0.1.RELEASE
