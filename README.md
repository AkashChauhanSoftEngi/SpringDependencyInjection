# SpringDependencyInjectionUsingXml

* Spring 3 + J2EE (J2EE Container) + DI using setter and constructor, Example
* Dependency Injection using Setter and constructor, check XML file how to pass values to setters and constructors
* Pass values through XML file to java classes
* Used ApplicationContext Interface, and used ClassPathXmlApplicationContext Implementation class
* Used applicationContext.xml for defining beans
* Spring requires Spring JAR/Libraries and JDK Libraries to run an Spring based application 
* We need a driver class [ClassPathXmlApplicationContext] to run Spring container[IOC], which implements ApplicationContext Interface

* DI using setter [primitive data type] primitive data injection in Spring using setter method
```xml
 	<bean id="studentbean" class="com.java.spring.Student">  
    		<property name="name" value="Vimal Jaiswal"></property>  
  	</bean>
```
* DI using constructor [primitive data type] or primitive data injection in Spring using constructor
```xml
  <bean id="teacherBean" class="com.java.spring.Teacher" scope="singleton">
	  	<constructor-arg value="female">
	  	</constructor-arg>
	</bean>
```

* DI on [secondary data type] or Secondary data injection in Spring
```xml
	<bean id="locationbean" class="com.java.spring.Location">
		<property name="street" value ="New Road"></property>
		<property name="zipCode" value ="123"></property>
	</bean>
	------------------------------------------------------
	<bean id="schoolbean" class="com.java.spring.School">
		<property name="name" value="DPS, Dlehi"></property>
		<property name="location" ref="locationbean"></property>
	</bean>

	or by using nested bean

	<bean id="schoolbean" class="com.java.spring.School">
		<property name="name" value="DPS, Dlehi"></property>
		<property name="location">
			<bean class="com.java.spring.Location">
				<property name="street" value ="New Road"></property>
				<property name="zipCode" value ="123"></property>
			</bean>
		</property>
	</bean>
```

* DI using primitive Array or Primitive Array injection in Spring
```xml
	<bean id="locationbean" class="com.java.spring.Location">
		<property name="street">
			<array>
				<value>DPS</value>
				<value>DELHI</value>
				<value>CP</value>
			</array>
		</property>
		<property name="zipCode" value ="123"></property>
	</bean>
```

* DI using Collections or Collection Injection in Spring
```xml
	<bean id="departmentbean" class="com.java.spring.Department">
		<property name="departmentOne">
			<util:list list-class="java.util.Vector">
				<value>CS</value>
				<value>IT</value>
				<value>CSE</value>
			</util:list>
		</property>
		<property name="departmentTwo">
			<set>
				<value>EC</value>
				<value>ECS</value>
				<value>EIT</value>
				<value>EIT</value>
			</set>
		</property>
		<property name="departmentThree">
			<map>
				<entry key="1" value="ONE"></entry>
				<entry key="2" value="TWO"></entry>
				<entry key="3" value="THREE"></entry>
			</map>
		</property>
	</bean>
```

* Property data/file injection in Spring
```xml
	<bean id="propertybean" class="com.java.spring.Property">
		<property name="driver">
			<props>
				<prop key="driverName">Sample</prop>
				<prop key="url">www.sample.com</prop>
				<prop key="userName">sampleUser</prop>
			</props>
		</property>
			
		<!-- ----------------OR-------------------- -->
		
		<property name="driver">
			<util:properties location="classpath:resources/Drivers.properties"/>
		</property>
	</bean>
```

* Using Multiple ApplicationContext files
```java
	String[] files = new String[]{"resources/applicationContextOne.xml","resources/applicationContextTwo.xml"};
	ApplicationContext ap = new ClassPathXmlApplicationContext(files);	
```

* J2EE IOC
```java
	ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");
```

> **###1. Technologies**
* Spring 3.0.1.RELEASE

> **###2. Spring Circular dependency**
* a>b>a
* Solution
  - redesign comonents, dependent on each other
  - @Lazy {upload only when needed, one of them}
  - Use setter injection (or field injection){optional, when needed}, instead of constructor injection {@Required}
  - Use @PostConstruct to set the other dependency
  - InitializingBean, afterPropertySet
* Reference: https://www.baeldung.com/circular-dependencies-in-spring
