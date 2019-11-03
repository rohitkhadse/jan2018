package com.binarysearch;


public class BinarySearch
{

 static int search(int array[], int left, int right, int find)
 {
     if (right >= left)
     {
         int mid = left + (right - left)/2;

         if (array[mid] == find)
            return mid;

         if (array[mid] > find)
            return search(array, left, mid-1, find);
         return search(array, mid+1, right, find);
     }

     return -1;
 }

 public static void main(String args[]){
     
     int array[] = {4,7,9,11,20};
     int find = 11;
     
     int result = search(array,0,array.length-1,find);
     if (result == -1)
         System.out.println("Sorry, Number not found");
     else
         System.out.println("Number found at index " + result);
 }
}
