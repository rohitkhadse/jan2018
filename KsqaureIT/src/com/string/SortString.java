package com.string;

import java.util.Arrays;

public class SortString {
	public static String staticVariable;

	public static void main(String[] args) {
		String s  = "suresh";
		
		char[] c = s.toCharArray();
		SortString.staticVariable ="Rohit";
		System.out.println(SortString.staticVariable);
		SortString ss = new SortString();
		ss.accessingStaticVaraible();
		
		//Arrays.sort(c, Collections.reverseOrder());
		Arrays.sort(c);
		
		for(int i=c.length-1; i>0 ;i--){
			System.out.print(c[i]);		
		}
	}
	
	public void accessingStaticVaraible(){
		SortString.staticVariable = "John";
		System.out.println(SortString.staticVariable);
	}

}
