package com.java8.FunctionalInterface;

public class FunctionInterfaceTest {

	public static void main(String[] args) {
		MyFunctionalInterface sum = (a , b) -> a+b;
		System.out.println("Addition : "+ sum.arithmaticMethod(3, 4));
		
		MyFunctionalInterface multiply = (a , b) -> a*b;
		System.out.println("Multiply : "+ multiply.arithmaticMethod(3, 4));

	}

}
