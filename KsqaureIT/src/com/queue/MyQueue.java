package com.queue;

import java.util.Arrays;

public class MyQueue {

	public static void main(String[] args) {
		String[] s = new String[4];
		s[0] = "A";
		s[1] = "B";
		s[2] = "C";
		s[3] = "D";

		remove(s);
		add(s,"E");
	}

	private static void add(String[] s, String string) {
		int a = s.length;
		String[] newstr = new String[a+1];
		
		for(int i=0;i<newstr.length;i++){
			if(i == newstr.length-1){
				newstr[i]=string;
			}
			else{
				newstr[i]=s[i];
			}
			
		}
		
		System.out.println(Arrays.toString(newstr));
	}

	private static void remove(String[] s) {
		int a = s.length;
		String[] newstr = new String[a-1];
		
		for(int i=0;i<a-1;i++){
			newstr[i]=s[i+1];
		}
		
		System.out.println(Arrays.toString(newstr));
	}

}
