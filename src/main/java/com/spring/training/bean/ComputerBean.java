package com.spring.training.bean;

public class ComputerBean {

	private String model;
	private String ramSize;
	
	public String getModel() {
		return model;
	}
	public String getRamSize() {
		return ramSize;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setRamSize(String ramSize) {
		this.ramSize = ramSize;
	}
	@Override
	public String toString() {
		return "ComputerBean [model=" + model + ", ramSize=" + ramSize + "]";
	}
	
}
