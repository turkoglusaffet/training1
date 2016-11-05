package com.spring.training.bean;

public class EmployeeBean {

	private String firstName;
	private String lastName;
	private String email;
	private AddressBean address;
	
	
	public void init(){
		System.out.println("Init Metod : " + EmployeeBean.class);
	}
	public void destroy(){
		System.out.println("Destroy Metod : " + EmployeeBean.class);
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public AddressBean getAddress() {
		return address;
	}
	public void setAddress(AddressBean address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "EmployeeBean [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", address="
				+ address.toString() + "]";
	}
	
}
