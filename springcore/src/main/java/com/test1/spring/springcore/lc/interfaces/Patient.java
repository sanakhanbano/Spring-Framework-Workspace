package com.test1.spring.springcore.lc.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//configure lifecycle methods using spring interfaces
//lc
public class Patient implements InitializingBean,DisposableBean{ //interfaces
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

	@Override
	public void afterPropertiesSet() throws Exception {
		//init method in interface 
		System.out.println("inside init method afterPropertiesSet");
	}
	@Override
	public void destroy() throws Exception {
		//destroy method
		System.out.println("inside destroy method");
	}
	

}
