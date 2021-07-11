package com.test1.spring.springcore.dependencycheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	// private static ClassPathXmlApplicationContext context;
	private static ApplicationContext context;
	// ApplicationContext is parent interface

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("com/test1/spring/springcore/dependencycheck/config.xml");
		Prescription prescription = (Prescription) context.getBean("prescription");
		System.out.println(prescription);

	}
}
