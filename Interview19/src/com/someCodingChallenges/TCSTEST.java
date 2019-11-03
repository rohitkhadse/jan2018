package com.someCodingChallenges;

import java.util.*;

public class TCSTEST {

	public static void main(String[] args) {
		int [] arr = {1, 3, -7, 4, -8, 20, -9, 0};
		
		int [] newArr = moveNumbers(arr);
		
		System.out.println(Arrays.toString(newArr));
		
		/*for(int i=0;i<newArr.length;i++){
			System.out.println(newArr[i]);
		}*/

	}

	private static int[] moveNumbers(int[] arr) {
		int oranizeArray [] = new int[arr.length];
		int count = 0;
		int countBack=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<0){
				oranizeArray[count] = arr[i];
				count++;
			}
			else{
				oranizeArray[arr.length-1-countBack] =arr[i];
				countBack++;
			}
		}
		return oranizeArray;
	}

}
