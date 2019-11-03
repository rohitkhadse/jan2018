package com.someCodingChallenges;

public class PrimeNumber {

	public static void main(String[] args) {
		int number=7;
		boolean flag = true;
		int m = number/2;
		if(number ==1 || number ==0){
			System.out.println(number +"is not prime");
		}
		else{
			for(int i=2;i<m;i++){
				if(number % i==0){
					System.out.println(number + "is not prime");
					flag = false;
					break;
				}
			}
			if(flag ==  true){
				System.out.println(number + "is prime");
			}
		}//end else

	}

}
