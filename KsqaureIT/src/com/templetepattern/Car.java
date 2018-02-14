package com.templetepattern;

public class Car extends Vehicle{

	@Override
	public void start() {
		System.out.println("Starting car");
		
	}

	@Override
	public void drive() {
		System.out.println("Driving car");
		
	}

	@Override
	public void stop() {
		System.out.println("car stop");
		
	}

}
