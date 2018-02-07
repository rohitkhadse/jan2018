package com.factory;

public class Planet {

	private int id;
	private int size;
	private String name;
	
	public Planet(int id, int size, String name) {
		super();
		this.id = id;
		this.size = size;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
