package com.spring.training.bean;

public class CustomerBeanWithAbstract {

	private int type;
	private String action;
	private String Country;
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	@Override
	public String toString() {
		return "CustomerBean [type=" + type + ", action=" + action + ", Country=" + Country + "]";
	}
	
	
	
}
