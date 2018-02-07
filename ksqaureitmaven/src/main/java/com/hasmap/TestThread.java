package com.hasmap;

import java.util.HashMap;

import java.util.Map;


public class TestThread{
	
	public static void main(String[] args)  {
		
		Map<Integer,Car> map = new HashMap<Integer,Car>();
	
		map.put(1, new Car("green",2018));
		map.put(2, new Car("green",2017));
		map.put(3, new Car("red",2016));
		map.put(4, new Car("red",2017));
		
		//Equals methods
		if(map.get(1).equals(map.get(2))){
			System.out.println(true);
		}
		else{
			System.out.println(false);
		}
		
		//Generating hashCode
		System.out.println(map.get(1).hashCode());
		System.out.println(map.get(2).hashCode());
		
		
		
	}
	
}
