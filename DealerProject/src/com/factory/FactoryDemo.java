package com.factory;

public class FactoryDemo {

	public static void main(String[] args) {
		CarFactory cf = new CarFactory();
		
		Car car1 = cf.getCarObject("toyota");
		car1.drive();
	}

}
