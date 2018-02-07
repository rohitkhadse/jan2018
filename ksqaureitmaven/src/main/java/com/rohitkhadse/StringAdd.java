package com.rohitkhadse;

public class StringAdd {

	public static void main(String[] args) {
		String a="1234",b="321";
		int num1=convert(a);
		int num2=convert(b);
		
		System.out.println(add(num1,num2)); //TODO:convert to int to string
		
		
	}
	
	public static int add(int p,int q){
		int sum= p+q;
		return sum;
	}
	
	public static int convert(String p){
		char[] c=p.toCharArray();
		int sum=0,fact=1;
		
		for(int i=c.length-1; i>=0; i--){
			int k=(int)c[i];
			
			sum = sum+(k-48)*fact;
			fact*=10;
			
		}
		
		return sum;
	}

}
