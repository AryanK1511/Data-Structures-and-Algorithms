package com.company;

public class SearchInRange {
    public static void main(String[] args) {
        // Search for -2 and the range of the index should be from 1-4
        int[] arr = {3, 28, -2, 81, -35, 92, 54, 8, -6};

        int target = -2;
        int start = 1;
        int end = 4;

        System.out.println("Index: " + linearSearchRange(arr, target, start, end));
    }

    // This function searches an array and returns the target's index.
    // Return -1 if the item is not found
    static int linearSearchRange(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        // Run a for loop
        for (int i = start; i <= end; i++) {
            // Check if any element in the array is equal to the target element
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        // If no return statement is executed, that means the element was not found
        return -1;
    }
}
