package com.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int unsortedArray[] = {3,1,2,8,6,9};

        int sortedArray[] = bubbleSort(unsortedArray);

        System.out.println(Arrays.toString(sortedArray));
    }

    private static int[] bubbleSort(int[] unsortedArray) {

        boolean sorted = false;

        while(!sorted){
            sorted = true;

            for (int i = 0; i< unsortedArray.length-1;i++ ){
                if (unsortedArray[i] > unsortedArray[i+1]){
                    int temp = unsortedArray[i];
                    unsortedArray[i] = unsortedArray [i+1];
                    unsortedArray[i+1] = temp;

                    sorted = false;
                }
            }
        }

        return unsortedArray;
    }
}
