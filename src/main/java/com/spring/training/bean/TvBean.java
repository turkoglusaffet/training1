package com.spring.training.bean;

public class TvBean {

	private String model;
	private String inch;
	
	
	public String getInch() {
		return inch;
	}
	public String getModel() {
		return model;
	}
	public void setInch(String inch) {
		this.inch = inch;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "TvBean [model=" + model + ", inch=" + inch + "]";
	}
	
}
