package com.test1.spring.springcore.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	//private static ClassPathXmlApplicationContext context;
	private static ApplicationContext context; 
	//ApplicationContext is parent interface

	public static void main(String[] args) {
	context = new ClassPathXmlApplicationContext("com/test1/spring/springcore/map/mapconfig.xml");
	Customer customer = (Customer) context.getBean("customer");
	System.out.println(customer);
	//System.out.println(customer.getId());
    //System.out.println(customer.get());
    //System.out.println(customer.get().getClass());
    //get the type of list:Arraylist 
    //list is an interface
	}
}
