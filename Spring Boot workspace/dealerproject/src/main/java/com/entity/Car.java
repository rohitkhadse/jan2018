package com.entity;

public class Car {
	private int id;
	private String color;
	private int year;
	private String type;
	private String modelName;
	private String modelCompany;
	private int modelPrice;

	public Car(String modelName, String modelCompany, String color, String type, int year, int modelPrice, int id) {

		this.modelName = modelName;
		this.modelCompany = modelCompany;
		this.type = type;
		this.color = color;
		this.year = year;
		this.modelPrice = modelPrice;
		this.id = id;

	}
	public Car(){}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getModelCompany() {
		return modelCompany;
	}

	public void setModelCompany(String modelCompany) {
		this.modelCompany = modelCompany;
	}

	public int getModelPrice() {
		return modelPrice;
	}

	public void setModelPrice(int modelPrice) {
		this.modelPrice = modelPrice;
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

}
