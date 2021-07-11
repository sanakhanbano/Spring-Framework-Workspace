package com.test1.spring.springcore.constructorinject.ambiguity;

public class Addition {
	/// create different parameterized constructor


	Addition(int a,Double b){
	System.out.println("inside DOUBLE");
	System.out.println("int=" +a);
	System.out.println("double=" +b);
	
	}
	/*
	Addition(int a, int b) {
		System.out.println("inside INT");
	}
	Addition(Double a,Double b){
	System.out.println("inside DOUBLE");
	}

	Addition(String a, String b) {
		System.out.println("inside STRING");
	}
	*/
}
