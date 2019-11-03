package com.string;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class DuplicateString {

	public static void main(String[] args) {
		String str = "I am am am learning java java";
		
		String strArray [] = str.split(" ");
		
		Map<String,Integer> map = new TreeMap<String,Integer>();
		for(String s : strArray){
			if(map.containsKey(s)){
				map.put(s, map.get(s)+1);
			}
			else{
				map.put(s, 1);
			}
		}
		
		System.out.println(map.toString());

	}

}
