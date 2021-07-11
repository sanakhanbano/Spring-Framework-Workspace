package com.test1.spring.springcore.lc.interfaces;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	//private static ClassPathXmlApplicationContext context;
	private static AbstractApplicationContext context; 
	//ApplicationContext is parent interface
	//we need to tell the container- to enable pre-destruction cook before the container gets destroyed 
	//we should invoke the destroyed method 
	//we need abstract parent class

	public static void main(String[] args) {
	context = new ClassPathXmlApplicationContext("com/test1/spring/springcore/lc/interfaces/config.xml");
	Patient patient = (Patient) context.getBean("patient");
	System.out.println(patient);
	context.registerShutdownHook();
	//this is the method that we need to invoke on the abstract application context
	//it helps the container to invoke the destroy methods
	//before container is shutdown, it needs to use Hook to invoke the destroy methods
	
	}
}
