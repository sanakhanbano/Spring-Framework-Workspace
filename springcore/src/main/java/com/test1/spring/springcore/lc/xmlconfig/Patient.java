package com.test1.spring.springcore.lc.xmlconfig;
//configure lc methods using xmlconfig
//lifecycle init() and destroy() methods 
public class Patient {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public void hi() {
		System.out.println("inside the init method hi");
	}
	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

	public void bye() {
		System.out.println("inside the method bye");
	}
	

}
