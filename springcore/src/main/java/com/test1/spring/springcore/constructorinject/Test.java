package com.test1.spring.springcore.constructorinject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	// private static ClassPathXmlApplicationContext context;
	private static ApplicationContext context;
	// ApplicationContext is parent interface

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("com/test1/spring/springcore/constructorinject/config.xml");
		Employee e = (Employee) context.getBean("employee"); //object 1 with bean name
		System.out.println(e);
		//System.out.println(e.hashCode()); //to memory location
		
		//Employee e2 = (Employee) context.getBean("employee"); //objects 2
		//System.out.println(e2);
		//System.out.println(employee2.hashCode());
		
		

	}
}
