package com.spring.training.bean;

import java.util.List;

public class SchoolBean {

	private String name;
	private String level;

	private List<String> students;
	
	
	public SchoolBean(String level) {
		super();
		this.level = level;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public List<String> getStudents() {
		return students;
	}
	public void setStudents(List<String> students) {
		this.students = students;
	}
	@Override
	public String toString() {
		return "SchoolBean [name=" + name + ", level=" + level + ", students=" + students + "]";
	}
	
	
	
}
