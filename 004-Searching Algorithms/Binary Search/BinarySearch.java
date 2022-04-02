package com.company;

public class BinarySearch {
    public static void main(String[] args) {
        // This program demonstrates the implementation of binary search
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 18;
        int ans = binarySearch(arr, target);
        System.out.println("Index: " + ans);
    }

    // This function iterates through an array and return's the target's index
    // Return -1 if item not found
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // Find the middle element
            // int mid = (start + end) / 2;  // Might cause Overflow
            int mid = start + ((end - start) / 2); // This is a better approach as it does not cause overflow

            if (target < arr[mid]) {
                end = mid - 1;
            }
            else if (target > arr[mid]) {
                start = mid + 1;
            }
            else {
                // Answer Found
                return mid;
            }
        }
        // If no answer is found
        return -1;
    }
}
