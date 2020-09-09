package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("abc","rohit","","rahul","John","Arya");
		
		//removing empty string
		List<String> filteredString = strings.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());
		System.out.println("removing empty strings :"+filteredString);

		List<String> lessThanLength5 = strings.stream().filter(s -> s.length() < 5).collect(Collectors.toList());
		System.out.println("lessThanLength5 : "+lessThanLength5);
		
		//MAP in Stream
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		List<Integer> squareList = numbers.stream().sorted(Comparator.reverseOrder()).map(i -> i*i).distinct().collect(Collectors.toList());
		//squareList = numbers.stream().map(integer -> integer*integer).distinct().collect(Collectors.toList());
		System.out.println("squareList : "+squareList);
		
		List<String> startWithR = strings.stream().filter(s -> s.startsWith("r")).collect(Collectors.toList());
		System.out.println("startWithR : "+startWithR);
		System.out.println("startWithR without stream: ");
		startWithRwithoutStream(strings);
	}

	private static void startWithRwithoutStream(List<String> strings) {
		// TODO Auto-generated method stub
		List<String> newList = new ArrayList<>();
		for(String s: strings){
			if(s.startsWith("r")){
				newList.add(s);
			}
		}
		
		System.out.println(newList);
	}

}
