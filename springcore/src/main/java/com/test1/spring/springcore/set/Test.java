package com.test1.spring.springcore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	//private static ClassPathXmlApplicationContext context;
	private static ApplicationContext context; 
	//ApplicationContext is parent interface

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("com/test1/spring/springcore/set/setconfig.xml");
		CarDealer cardealer = (CarDealer) context.getBean("cardealer");
		System.out.println(cardealer.getName());
		System.out.println(cardealer.getModels());
		System.out.println(cardealer.getModels().getClass().getName());
		//get default set type:LinkedHashSet
	}

}
