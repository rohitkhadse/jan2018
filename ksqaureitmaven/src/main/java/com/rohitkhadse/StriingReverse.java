package com.rohitkhadse;

public class StriingReverse {

	public static void main(String[] args) {
		String s="Rohit";
		
		char[] c= s.toCharArray();
		
		for(int i=c.length-1;i>=0;i--){
			System.out.print(c[i]);
		}
		
	}

}
