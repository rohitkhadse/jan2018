package com.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSorting {

	public static void main(String[] args) {
		List<Movie> listOfMovie = new ArrayList<Movie>();
		listOfMovie.add(new Movie("Avenger",8.5,2012));
		listOfMovie.add(new Movie("Iron Man",7.4,2009));
		listOfMovie.add(new Movie("Star Wars",9.0,2015));
		listOfMovie.add(new Movie("Forrest Gump",9.3,1994));
		
		Collections.sort(listOfMovie);
		
		for (Movie movie : listOfMovie){
			System.out.println(movie.toString());
		}
		
		System.out.println("---------Name Comparator-------");
		Collections.sort(listOfMovie, new NameComparator());
		
		for (Movie movie : listOfMovie){
			System.out.println(movie.toString());
		}
		
		System.out.println("---------Rating Comparator-------");
		Collections.sort(listOfMovie, new RatingComparator());
		
		for (Movie movie : listOfMovie){
			System.out.println(movie.toString());
		}
	}

}
