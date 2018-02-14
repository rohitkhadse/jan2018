package com.templetepattern;

public class Bike extends Vehicle{

	@Override
	public void start() {
		System.out.println("Starting Bike");
		
	}

	@Override
	public void drive() {
		System.out.println("Driving Bike");
		
	}

	@Override
	public void stop() {
		System.out.println("Stop Bike");
		
	}

}
