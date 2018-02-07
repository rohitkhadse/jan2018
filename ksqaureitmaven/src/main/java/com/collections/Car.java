package com.collections;

public class Car implements Comparable<Car>{
	private int id;
	private String color;
	private int year;
	private String type;
	private int price;
	
	public Car(int id,String color, int year, String type,int price) {
		super();
		this.id = id;
		this.color = color;
		this.year = year;
		this.type = type;
		this.price=price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		return "Car [id= "+id +", color=" + color + ", year=" + year + ", type=" + type + ", price="+ price+"]";
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