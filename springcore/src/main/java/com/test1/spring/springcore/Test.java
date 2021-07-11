package com.test1.spring.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	private static ClassPathXmlApplicationContext ctx;

	public static void main(String[] args) {
	ctx = new ClassPathXmlApplicationContext("config.xml");
		Employee emp = (Employee) ctx.getBean("emp");
		System.out.println("Employee ID=" + emp.getId());
		System.out.println("Employee Name=" + emp.getName());
	}

}
