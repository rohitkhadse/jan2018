package com.arrays;

import java.util.Arrays;

public class IntegerArrays {

	public static void main(String[] args) {
		int a[]={2,4,8,6,5};
		int[] rArray=remove(a,8);
		int[] iArray=insert(a,10,2);
		System.out.println(Arrays.toString(rArray));
		System.out.println(Arrays.toString(iArray));
		System.out.println(Arrays.toString(sort(a)));
	}
	
	static int [] remove(int a[],int element){
		
		boolean flag=false;
		int[] newarray= new int[a.length-1];
		
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
	
	static int[] insert(int a[],int element,int position){
		boolean flag=false;
		int[] newarray= new int[a.length+1];
		
		for(int i=0;i<newarray.length;i++){
			if(i==position){
				newarray[i]=element;
				flag=true;
			}
			else if(flag){
				newarray[i]=a[i-1];
			}
			else {
				newarray[i]=a[i];
			}
		}
		
		return newarray;
	}
	
	static int[] sort(int a[]){
		for(int i=0;i<a.length-1;i++){
			int minIndex=i;
			
			for(int j=i+1;j<a.length;j++){
				if(a[j] < a[minIndex])
					minIndex=j;
			}
			
			int temp = a[minIndex];
			a[minIndex]=a[i];
			a[i]=temp;
		}
		return a;
	}
	static void printArray(int a[]){
		System.out.print("[");
		for(int arr:a){
			System.out.print(arr+" ");
		}
		System.out.print("]");
	}

}
