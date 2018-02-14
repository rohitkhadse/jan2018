package com.templetepattern;

public class StartVehicle {

	public static void main(String[] args) {
		Vehicle vehicleType =  new Car();
		
		//using Template method
		vehicleType.operateVehicle();
		
		System.out.println("------------------------");
		
		vehicleType =  new Bike();
		vehicleType.operateVehicle();

	}

}
