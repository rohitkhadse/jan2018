package com.state;

import java.util.Scanner;

public class Car {

	//state
	private int miles;
	private boolean engineStart;
	private float fuel;
	
	public Car(int miles, boolean engineStart, float fuel) {
		this.miles = miles;
		this.engineStart = engineStart;
		this.fuel = fuel;
	}

	//Behavior
	public void drive(){
		if(!engineStart){
			print("Start the engine");
		}
		else{
			print("You are driving");
			miles=miles+10;
			fuel-=5;
		}
	}
		
	public boolean startEngine(){
		if(fuel==0.0){
			print("Fuel tank is empty");
		}
		return engineStart=true;	
	}
		
	public void applyBrake(){
		print("Applying break....");
	}
		
	
	public boolean stop(){
		print("Car stops");
		return engineStart=false;	
	}
	
	public boolean checkFuel(){
		return (fuel==0);
	}
	
	
	@Override
	public String toString() {
		return "Car [Miles Driven=" + miles + ", Engine Start=" + engineStart + ", Fuel Remaining=" + fuel + "]"+"\n";
	}
	
	//setter and getter
	public int getMiles() {
		return miles;
	}

	public float getFuel() {
		return fuel;
	}
	public void setFuel(float fuel) {
		this.fuel = fuel;
	}

	public static void print(Object o){
		System.out.println(o);
	}

	//Main method
	public static void main(String args[]){
		Car c = new Car(0,false,20);
		
		print("Choose the following option to operate the car");
		
		while(true){
			Scanner sc = new Scanner(System.in);
			print("1.Start 2.Drive 3.Stop 4.Fuel");
			int i=sc.nextInt();
			
			switch(i){
				case 1:
					c.startEngine();
					print("Engine starts, now drive");
					print(c);
					break;
				case 2:
					
					if(c.checkFuel()){
						print("Fuel empty,to fill the fuel press 4");
					}
					else{
						c.drive();
						print(c);
					}
					break;
				case 3:
					c.applyBrake();
					c.stop();
					print(c);
					System.exit(0);
				case 4:
					c.setFuel(20.0f);
					print("Fuel tank is full,now drive");
					break;
				default:
					print("Please enter proper input");
			}
			
			
		}
	}

	
	
}
