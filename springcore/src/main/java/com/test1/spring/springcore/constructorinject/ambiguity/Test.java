package com.test1.spring.springcore.constructorinject.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	// private static ClassPathXmlApplicationContext context;
	private static ApplicationContext context;
	// ApplicationContext is parent interface

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("com/test1/spring/springcore/constructorinject/ambiguity/config.xml");
		Addition add = (Addition) context.getBean("addition"); //object 1 with bean name
		System.out.println(add);
		
	}
}
