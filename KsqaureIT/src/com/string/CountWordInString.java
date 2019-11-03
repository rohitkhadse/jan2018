package com.string;

import java.util.HashMap;
import java.util.Map;

public class CountWordInString {

	public static void main(String[] args) {
		String s = "I felt happy because I saw others were happy";
		
		Map<String, Integer> map= countWord(s);
		
		map.entrySet().stream().forEach(m -> System.out.println(m.getKey() +" = " +m.getValue()));

	}

	private static Map<String, Integer> countWord(String s) {
		String strArr[] = s.split(" ");
		Map<String, Integer> map = new HashMap<>();
		
//		for(String newString : strArr){
//			map.put(newString, map.getOrDefault(newString, 0)+1);
//		}
		
		for(String newString : strArr){
			if(map.containsKey(newString)){
				map.put(newString, map.get(newString)+1);
			}
			else{
				map.put(newString, 1);
			}
		}
		return map;
	}

}
