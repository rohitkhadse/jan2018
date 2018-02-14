package com.factory;

public class FactoryVehicle {

	public Vehicle getVehicle(String vtype){
		if(vtype.equalsIgnoreCase("BIKE")){
			return new Car();
		}
		else if(vtype.equalsIgnoreCase("CAR")){
			return new Bike();
		}
		return null;
	}
}
