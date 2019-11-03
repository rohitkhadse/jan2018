package com.java8;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceTest {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("abc","rohit","","rahul","John","Arya");
		strings.forEach(System.out::println);

	}

}
