package com.spring.training.bean;

import java.util.List;

public class CustomerBean {

	private int type;
	private String action;
	private String Country;
	private List<String> techList;
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
	public List<String> getTechList() {
		return techList;
	}
	public void setTechList(List<String> techList) {
		this.techList = techList;
	}
	@Override
	public String toString() {
		return "CustomerBean [type=" + type + ", action=" + action + ", Country=" + Country + ", techList=" + techList
				+ "]";
	}

	
	
	
}
