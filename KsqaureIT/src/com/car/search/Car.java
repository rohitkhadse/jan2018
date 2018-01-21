package com.car.search;

public class Car {
	private String color;
	private int year;
	private String type;
	
	public Car(String color, int year, String type) {
		super();
		this.color = color;
		this.year = year;
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", year=" + year + ", type=" + type + "]";
	}
	
	
}
