package com.string;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Hello World!";
		System.out.println(reverseStringWithBuilder(str));
		System.out.println(reverseStringManually(str));
		System.out.println(totallyManual(str));
		System.out.println("using recursion = " + usingRecursion(str));

	}

	private static String usingRecursion(String str) {
		String s = "";
		if (str.length()==1){
			return str;
		}
		else {
			int stringLength = str.length()-1;
			s = str.charAt(stringLength) + usingRecursion(str.substring(0,stringLength));
		}

		return s;
	}

	//best approach for programming interviews
	/*
	 * Disadvantage : You will create new string instance everytime
	 * */
	private static String totallyManual(String str) {
		String returnStr ="";
		char[] chrArray=str.toCharArray();
		
		for(int i = str.length()-1;i>=0;i--){
			returnStr = returnStr + chrArray[i];
		}
		return returnStr;
	}

	//best approach for actual coding
	private static String reverseStringManually(String str) {
		StringBuilder sb =  new StringBuilder(str);
		sb.reverse();
		return sb.toString();
	}

	//best approach to impress interviewer
	private static String reverseStringWithBuilder(String str) {
		StringBuilder sb =  new StringBuilder();
		for(int i=str.length()-1;i>=0;i--){
			sb.append(str.charAt(i));
		}
		
		return sb.toString();
	}
	
	

}
