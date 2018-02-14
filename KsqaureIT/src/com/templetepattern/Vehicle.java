package com.templetepattern;

public abstract class Vehicle {

	public final void operateVehicle(){
		start();
		drive();
		stop();
	}
	
	public abstract void start();
	public abstract void drive();
	public abstract void stop();
	
}
