package com.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> hashSet =  new HashSet<String>();
		hashSet.add("Rohit");
		hashSet.add("John");
		hashSet.add("Arya");
		hashSet.add("Rohit");
		
		System.out.println("------Iterating by for loop-----------");
		for(String name :  hashSet){
			System.out.println(name);
		}
		
		System.out.println("\n------Iterating by forEach Java 8 loop-----------");
		hashSet.forEach(System.out::println);
		
		Iterator<String> it = hashSet.iterator();

		System.out.println("\n------Iterating using Iterator-----------");
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}

}
