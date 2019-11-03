package com.digital;

public class MaxDiff {
	public static void main(String args[]){
		//int arr[] ={7,2,3,10,2,4,8,1};
		int arr[] = {7,9,5,6,3,2};
		//int arr[] = {2,3,10,2,4,8,1};

		System.out.println("max diff :" + maxDiff(arr));
	}
	
	public static int maxDiff(int array[]){
		int temp=0;
		int max=0;
		int result= 0;
		
		for(int i=0;i<array.length-1;i++){
			temp = i+1;
			
			System.out.println("temp for i "+i+ ":"+Math.abs(temp));
			
			while(temp<array.length && (array[temp]>array[i])){
				max = Math.abs(array[temp] - array[i]);
				if(max > result){
					result = max;
				}
				temp++;
			}
			
		}
		
		return result;
	}
}
