package com.hasmap;

import java.util.Arrays;

public class SortingIntArray {

	public static void main(String[] args) {
		int[] array = new int[10];
		
		for(int i=0;i<array.length;i++){
			array[i]=(int) (Math.random()*100);
		}
		
		Arrays.sort(array);
		
		for(int a:array){
			System.out.println(a);
		}
		

	}

}
