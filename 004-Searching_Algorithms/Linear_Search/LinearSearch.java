package com.company;

public class LinearSearch {
    public static void main(String[] args) {
        // This program demonstrates 3 ways of performing linear search on arrays
        int[] nums = {73, 28, 63, 10, -3, -2, 76, 39};
        int target = 76;

        // Used for linearSearchIndexReturn() Function
        int indexOfElement = linearSearchIndexReturn(nums, target);
        System.out.println("Index of " + target + " : " + indexOfElement);

        // Used for linearSearchElementReturn() Function
        int element = linearSearchElementReturn(nums, target);
        System.out.println("Element is : " + element);

        // Used for linearSearchBoolean() Function
        boolean foundOrNot = linearSearchBoolean(nums, target);
        System.out.println("Element was found : " + foundOrNot);
    }

    // This function searches an array and returns the target's index.
    // Return -1 if the item is not found
    static int linearSearchIndexReturn(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        // Run a for loop
        for (int i = 0; i < arr.length; i++) {
            // Check if any element in the array is equal to the target element
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        // If no return statement is executed, that means the element was not found
        return -1;
    }

    // This function returns the element when it is found
    static int linearSearchElementReturn(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        // Run an enhanced for loop
        for (int element : arr) {
            // Check if any element in the array is equal to the target element
            if (element == target) {
                return element;
            }
        }
        // If no return statement is executed, that means the element was not found
        return Integer.MAX_VALUE; // -1 may be an element in the array
    }

    // This function return 'true' if the element is found and 'false' if the element is not found
    static boolean linearSearchBoolean(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }

        // Run an enhanced for loop
        for (int element : arr) {
            // Check if any element in the array is equal to the target element
            if (element == target) {
                return true;
            }
        }
        // If no return statement is executed, that means the element was not found
        return false; // -1 may be an element in the array
    }
}
