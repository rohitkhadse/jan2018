package com.car.search;

public class Car implements Comparable<Car>{
	private String color;
	private int year;
	private String type;
	private int price;
	
	public Car(String color, int year, String type,int price) {
		super();
		this.color = color;
		this.year = year;
		this.type = type;
		this.price=price;
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", year=" + year + ", type=" + type + ", price="+ price+"]";
	}

	@Override
	public int compareTo(Car car) {
		if(price == car.price)
			return 0;
		else if(price  > car.price)
			return 1;
		else 
			return -1;
	}
	
	
}