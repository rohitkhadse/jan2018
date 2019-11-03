package com.someCodingChallenges;

public class FibonnaciSeries {

	public static void main(String[] args) {
		// TODO 1 1 2 3 5 8 13
		for(int i=1;i<=5;i++){
			System.out.println(printFibonnaci(i));
		}
		System.out.println("=====================================");
		withoutRecursion(5);
	}

	private static void withoutRecursion(int i) {
		int n1=1,n2=1,n3,count =i;
		
		System.out.println(n1 +" \n" +n2);
		for(i=2;i<count;i++){
			n3=n1+n2;
			n1=n2;
			n2=n3;
			
			System.out.println(n3);
		}
	}

	//recursive
	private static int printFibonnaci(int number) {
		if(number ==1 || number ==2){
			return 1;
		}
		return printFibonnaci(number -1)+printFibonnaci(number -2);
	}


}
