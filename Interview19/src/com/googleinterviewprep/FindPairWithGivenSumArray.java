package com.googleinterviewprep;

public class FindPairWithGivenSumArray {
    public static void main(String[] args) {
        int arr[] ={8,7,2,5,3,1};
        int arr2[] = {};
        int sum = 10;
        
        findPair(arr,sum);
    }

    private static void findPair(int[] arr, int sum) {

        for (int i=0;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length-1;j++){
                if (arr[i] + arr[j] == sum){
                    System.out.println("Pair found at index "+ i +" and " + j + " " + "(" + arr[i]+ " + " + arr[j] + ")");
                }
            }
        }
    }
}
