package com.interger.programs;

public class SecondLeast {

	public static void main(String[] args) {
		int [] a={4,5,6,3,2,1};
		//int [] a={};
		
		if(a.length==0){
			System.out.println("Array is null");
			System.exit(0);
		}
		else{
			for(int i=0;i<a.length-1;i++){
				int index=i;
				
				for(int j=i+1;j<a.length;j++){
					if(a[j] < a[index])
						index=j;
				}
				
				int temp = a[index];
				a[index]=a[i];
				a[i]=temp;
			}
		}
		
		
		System.out.println(a[1]);

	}

}
