package com.factory;

public class CarFactory {

	public Car getCarObject(String carType){
		
		if(carType.equalsIgnoreCase("Toyota")){
			return new Toyota();
		}
		else if(carType.equalsIgnoreCase("Ford")){
			return new Ford();
		}
		return null;
		
	}
}
