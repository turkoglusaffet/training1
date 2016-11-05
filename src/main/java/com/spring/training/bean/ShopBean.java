package com.spring.training.bean;

import java.util.HashMap;
import java.util.List;

public class ShopBean {

	private List<String> techList;
	private HashMap<String, String> keyMap;
	
	public HashMap<String, String> getKeyMap() {
		return keyMap;
	}
	public List<String> getTechList() {
		return techList;
	}
	public void setTechList(List<String> techList) {
		this.techList = techList;
	}
	public void setKeyMap(HashMap<String, String> keyMap) {
		this.keyMap = keyMap;
	}
	@Override
	public String toString() {
		return "ShopBean [techList=" + techList + ", keyMap=" + keyMap + "]";
	}
	
	
	
	
	
}
