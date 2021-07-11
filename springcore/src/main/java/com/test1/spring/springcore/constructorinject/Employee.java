package com.test1.spring.springcore.constructorinject;
//no need setter injection
//constructor injection is done
public class Employee {
	private int id;
	private Address address;
	//create parameterized constructor
	Employee(int id, Address address){
		this.id=id;
		this.address= address;
	}
	/*setter getter methods for setter injection
	 * public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	*/
	@Override
	public String toString() {
		return "Employee [id=" + id + ", address=" + address + "]";
	}

}
