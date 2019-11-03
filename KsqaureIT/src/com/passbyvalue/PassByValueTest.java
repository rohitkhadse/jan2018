package com.passbyvalue;

public class PassByValueTest extends Object{

	public static void main(String[] args) {
		int value=1;
		String s = "";
		System.out.println("before update :" + value);
		
		updateValue(value);
		
		System.out.println("After update : "+ value);
	}

	private static void updateValue(int value2) {
		value2 =100;
		System.out.println("Inside updateValue : "+ value2);
	}

}
