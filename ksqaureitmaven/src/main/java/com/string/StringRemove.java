package com.string;

import java.util.Arrays;

public class StringRemove {

	public static void main(String[] args) {
		String[] s = {"John","Rohit","Becky","Karen"};
		
		System.out.println(Arrays.toString(remove(s,"Becky")));

	}

	static String [] remove(String a[],String element){
		
		boolean flag=false;
		String[] newarray= new String[a.length-1];
		
		for(int i=0;i<newarray.length;i++){
			if(a[i]==element){
				newarray[i]=a[i+1];
				flag=true;
			}
			else if(flag){
				newarray[i]=a[i+1];
			}
			else{
				newarray[i]=a[i];
			}
				
			
		}
		
		return newarray;
	}
}
