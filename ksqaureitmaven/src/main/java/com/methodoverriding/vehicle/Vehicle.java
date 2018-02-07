package com.methodoverriding.vehicle;

public class Vehicle {
	
	public Vehicle(){
		System.out.println("Vehicle Class Constructor");
	}
	
	public void move(){
		System.out.println("Vehicle is moving");
	}
	
	protected void driving(){
		System.out.println("Driving...");
	}
}
