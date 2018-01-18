package com.methodoverriding;

import com.methodoverriding.vehicle.Vehicle;

//Child class of Vehicle
public class Toyota extends Vehicle{
	
	public Toyota(){
		super();
	}
	
	//method overriding
	public void move(){
		System.out.println("Toyota car is moving");
	}
	
	//method overloading
	public void move(int speed){
		System.out.println("Toyota car is moving with "+ speed+ " mph");
	}
	
	//method overriding
	public void driving(){
		System.out.println("Your are driving Toyota..");
	}
	
	public static void main(String args[]){
		//command line argument
		String make=args[0];
		String year=args[1];
		
		System.out.println("This is "+make+" car of "+year+" model");
		
		Toyota t= new Toyota();
		t.move();
		t.move(50);
		t.driving();
		
	}
}
