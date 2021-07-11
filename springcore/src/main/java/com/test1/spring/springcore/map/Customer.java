package com.test1.spring.springcore.map;

import java.util.Map;

public class Customer {
	private int id;
	private Map<Integer,String> products;
	public Map<Integer,String> getProducts() {
		return products;
	}
	public void setProducts(Map<Integer,String> products) {
		this.products = products;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	///to call toString() method so that
	// so that when we print the fields/objects later on instead of calling the getter methods, 
	//we can directly print the instance class
	@Override
	public String toString() {
		return "Customer [id=" + id + ", products=" + products + "]";
	}

}
