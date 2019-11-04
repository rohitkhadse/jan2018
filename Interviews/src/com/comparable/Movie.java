package com.comparable;
/**
 * Comparable and Comparator use to sort the elements
 *
 */
public class Movie implements Comparable<Movie>{
	private String name;
	private double rating;
	private int year;
	
	public Movie(String name, double rating, int year) {
		super();
		this.name = name;
		this.rating = rating;
		this.year = year;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public int compareTo(Movie o) {
		//sorting in asc
		return this.year - o.year;
		
		//sorting in desc
		//return o.year - this.year;
	}

	@Override
	public String toString() {
		return "Movie [name=" + name + ", rating=" + rating + ", year=" + year + "]";
	}
	
	

}