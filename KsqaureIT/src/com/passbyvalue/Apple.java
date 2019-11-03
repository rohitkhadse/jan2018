package com.passbyvalue;

public class Apple {
	String name;
	
	public Apple(String name){
		this.name =name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Apple [name=" + name + "]";
	}

}
