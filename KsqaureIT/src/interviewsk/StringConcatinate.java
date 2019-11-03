package interviewsk;

import java.util.Arrays;

public class StringConcatinate {

	public static void main(String[] args) {
		String a = "abcdef",b="pqrqwery";
		boolean flag=false;

		char arr1[] = a.toCharArray();
		char arr2[] = b.toCharArray();
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		int length = (arr1.length < arr2.length)?arr1.length:arr2.length;
		
		
		StringBuilder sb = new StringBuilder();
		
		int i=0;
		for(i=0;i<length;i++){
				sb.append(arr1[i]);
				sb.append(arr2[i]);
			
		}
		if(length!=arr1.length){
			while(i<arr1.length){
				sb.append(arr1[i]);
				i++;
			}
		}
		else if(length != arr2.length){
			while(i<arr2.length){
				sb.append(arr2[i]);
				i++;
			}
		}
		
		System.out.println(sb);
		
	}

}
