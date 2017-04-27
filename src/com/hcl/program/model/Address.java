package com.hcl.program.model;

public class Address {

	String Address_Line1;
	String Address_Line2;
	String City;
	String State;
	String Zip_Code;
	
	public Address(String address_Line1, String address_Line2, String city, String state, String zip_Code) {
		super();
		Address_Line1 = address_Line1;
		Address_Line2 = address_Line2;
		City = city;
		State = state;
		Zip_Code = zip_Code;
	}
	public String getAddress_Line1() {
		return Address_Line1;
	}
	public void setAddress_Line1(String address_Line1) {
		Address_Line1 = address_Line1;
	}
	public String getAddress_Line2() {
		return Address_Line2;
	}
	public void setAddress_Line2(String address_Line2) {
		Address_Line2 = address_Line2;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getZip_Code() {
		return Zip_Code;
	}
	public void setZip_Code(String zip_Code) {
		Zip_Code = zip_Code;
	}
	
	
}
