package com.test1.spring.springcore.innerbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	// private static ClassPathXmlApplicationContext context;
	private static ApplicationContext context;
	// ApplicationContext is parent interface

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("com/test1/spring/springcore/innerbeans/config.xml");
		Employee employee = (Employee) context.getBean("employee"); //object 1
		System.out.println(employee);
		System.out.println(employee.hashCode()); //to memory location
		
		Employee employee2 = (Employee) context.getBean("employee"); //objects 2
		System.out.println(employee2);
		System.out.println(employee2.hashCode());
		
		//if both  hash code are same that means both objects are pointing to the same memory location
		//scope="prototype" : hash codes are different
		//By default scope is scope="singleton" : hash codes are same

	}
}
