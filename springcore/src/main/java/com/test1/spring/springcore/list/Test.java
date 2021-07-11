package com.test1.spring.springcore.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	//private static ClassPathXmlApplicationContext context;
	private static ApplicationContext context; 
	//ApplicationContext is parent interface

	public static void main(String[] args) {
	context = new ClassPathXmlApplicationContext("com/test1/spring/springcore/list/listconfig.xml");
	Hospital hospital = (Hospital) context.getBean("hospital");
	System.out.println(hospital.getName());
    System.out.println(hospital.getDepartments());
    System.out.println(hospital.getDepartments().getClass());
    //get the type of list:Arraylist 
    //list is an interface
	}
}
