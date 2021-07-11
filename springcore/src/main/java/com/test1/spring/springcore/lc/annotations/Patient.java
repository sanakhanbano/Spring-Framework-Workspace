package com.test1.spring.springcore.lc.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
//import org.springframework.context.annotation.Scope;
///import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;


//configure lifecycle methods using annotations
//lc
//@Component
//@Scope@Service
public class Patient {
	private int id;

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	@PostConstruct
	public void hi() {
		System.out.println("inside the init method hii");
	}
	@PreDestroy
	public void bye() {
		System.out.println("inside the method bye");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}
}
