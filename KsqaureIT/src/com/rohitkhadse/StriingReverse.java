package com.rohitkhadse;

public class StriingReverse {

	public static void main(String[] args) {
		String s="Rohit";
		
		char[] c= s.toCharArray();
		
		for(int i=c.length-1;i>=0;i--){
			System.out.print(c[i]);
		}
		
		System.out.println();
		
		StringBuffer sb = new StringBuffer("Mohit");
		sb.reverse();
		
		System.out.println("String reverse by String buffer : "+sb.toString());
		
		StringBuilder sbuild = new StringBuilder("Rahul");
		sbuild.reverse();
		
		System.out.println("String reverse by String builder : "+sbuild.toString());
	}

}
