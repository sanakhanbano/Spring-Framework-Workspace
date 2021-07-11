package com.test1.spring.springcore.propertyplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	private static ApplicationContext context;

	public static void main(String[] args) {
	context = new ClassPathXmlApplicationContext("com/test1/spring/springcore/propertyplaceholder/config.xml");
	MyDAO dao=(MyDAO) context.getBean("myDAO");
	System.out.println(dao);
	}
}
