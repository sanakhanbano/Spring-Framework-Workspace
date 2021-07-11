package com.test1.spring.springcore.innerbeans;

public class Address {
	private int hno;
	private String address;
	private String city;
	@Override
	public String toString() {
		return "Address [hno=" + hno + ", address=" + address + ", city=" + city + "]";
	}
	public int getHno() {
		return hno;
	}
	public void setHno(int hno) {
		this.hno = hno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	

}
