package com.hcl.program.model;

public class Person {
	
	public int ID;
	String Name;
	String Phone_Number;
	public Address Address;
	
	
	
	public Person(int iD, String name, String phone_Number, Address address) {
		super();
		ID = iD;
		Name = name;
		Phone_Number = phone_Number;
		Address = address;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPhone_Number() {
		return Phone_Number;
	}
	public void setPhone_Number(String phone_Number) {
		Phone_Number = phone_Number;
	}
	public Address getAddress() {
		return Address;
	}
	public void setAddress(Address address) {
		Address = address;
	}
	
	
	
	
	

}
