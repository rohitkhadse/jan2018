package com.sorting;

import java.util.Arrays;

public class QuickSortImplementation {
    public static void main(String[] args) {
        int numbers []  ={5,3,4,6,10,2};
        //int numbers []  =null;

        try {
            quickSort(numbers,0,numbers.length -1);
        }
        catch (NullPointerException e){
            e.printStackTrace();
            System.out.println("NullPointerException occurred");
        }


        System.out.println(Arrays.toString(numbers));
    }

    private static void quickSort(int[] numbers, int low, int high) {
        int i = low, j = high;

        if (numbers == null || numbers.length == 0){
            return;
        }

        if (low > high){
            return;
        }

        int middle = low + (high - low)/2;
        int pivot = numbers[middle];

        while (i<=j){

            while (numbers[i]< pivot){
                i++;
            }

            while (numbers[j] > pivot){
                j--;
            }

            if (i<=j){
                swap(numbers,i,j);
                i++;
                j--;
            }
        }

        if (low < j){
            quickSort(numbers,low,j);
        }

        if (high > i){
            quickSort(numbers,i,high);
        }
    }

    private static void swap(int[] numbers, int i, int j) {

        int temp = numbers[i];
        numbers[i] = numbers [j];
        numbers[j] = temp;
    }
}
