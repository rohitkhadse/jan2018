package com.passbyvalue;

public class ObjectPassByValue {

	public static void main(String[] args) {
		Apple apple = new Apple("rohit");
		
		System.out.println("before update :" + apple.getName());
		
		updateValue(apple);
		
		System.out.println("After update :" + apple.getName());
		
	}

	private static void updateValue(Apple apple) {
		apple.setName("Sid");
		
		apple = new Apple("Prashant");
		System.out.println("Inside update :" + apple.getName());
	}

}
