package com.company;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
    int[] arr = {5, 4, 3, 2, 1};
    bubbleSort(arr);
    System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr) {
        boolean swapped;
        // Run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // For each step, max item will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }

            // If you did not swap for a particular value of i, it means the array is sorted and hence stop the loop
            if (!swapped) {
                break;
            }
        }
    }
}
