package com.collections;

import java.util.HashMap;
import java.util.Map;

public class ListMap {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "d");
		
		for(Map.Entry<Integer, String> m: map.entrySet()){
			if(m.getKey()==2){
				m.setValue("x");
			}
			map.put(4, "f");
			
			System.out.println(m.getKey()+" "+m.getValue());
			
		}

	}

}
