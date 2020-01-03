package com.searching;

public class BinarySearch {
    public static void main(String[] args) {
        int searchElement = 6;
        int array[] = {2,5,6,7,9,11};

        int result = binarySearch(array,searchElement);

        if (result != -1){
            System.out.println("Element found at "+ result + "index");
        }
        else {
            System.out.println(" Element not found");
        }

    }

    private static int binarySearch(int arr[],int element) {
        int low = 0;
        int high = arr.length - 1;
        int mid;

        while (low <= high){

            mid = (low+high)/2;

            if (arr[mid]<element){
                low = mid +1;
            }
            else if (arr[mid]>element){
                high = mid - 1;
            }
            else {
                return mid;
            }
        }

        return -1;
    }
}
