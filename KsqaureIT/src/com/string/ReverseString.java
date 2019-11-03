package com.string;

public class ReverseString {

	public static void main(String[] args) {
		String originalString = "rohit";
		
		String reverseString = revereString(originalString);
		
		//System.out.println(originalString.substring(1) + originalString.charAt(0));
		System.out.println(reverseString);

	}

	private static String revereString(String originalString) {
		if(originalString.isEmpty())
			return originalString;
		
			return revereString(originalString.substring(1)) + originalString.charAt(0);
	}

}
