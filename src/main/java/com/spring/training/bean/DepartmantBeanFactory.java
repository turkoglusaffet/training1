package com.spring.training.bean;

public class DepartmantBeanFactory {

	public static DepartmantBean getDepartmantIT(){
		return new DepartmantBean("IT");
	}
	public static DepartmantBean getDepartmantHR(){
		return new DepartmantBean("HR");
	}
}
