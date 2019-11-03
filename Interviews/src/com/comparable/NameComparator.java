package com.comparable;

import java.util.Comparator;

public class NameComparator implements Comparator<Movie> {

	@Override
	public int compare(Movie o1, Movie o2) {
		return o2.getName().compareTo(o1.getName());
	}

}
