package com.project.SpringProject;

public class Address {

	int hno;
	String city;
	int pincode;
	
	Address() {
		
	}

	public Address(int hno, String city, int pincode) {
		super();
		this.hno = hno;
		this.city = city;
		this.pincode = pincode;
	}

	public int getHno() {
		return hno;
	}

	public void setHno(int hno) {
		this.hno = hno;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [hno=" + hno + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
	
	
	
}
