package com.hackerrank;

public class DifferanceArray {

	public static void main(String[] args) {
		int max=-1;
		int result=0;
		//int[] a= {7,2,3,10,2,4,8,1};
		//int[] a= {6,7,9,5,6,3,2};
		int[] a={5,7,6,5,4,3};
		for(int i=1; i<a.length;i++){			
			for(int j=i+1;j<a.length;j++){
				
				if(a[i]<a[j]){
					result=a[j]-a[i];
					if(result>max){
						max=result;
					}
			     }
			 }
		}
		System.out.println(max);		

	}

}
