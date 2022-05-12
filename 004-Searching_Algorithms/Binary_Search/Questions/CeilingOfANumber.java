package com.company;

public class CeilingOfANumber {
    public static void main(String[] args) {
        // Q) Find the ceiling of the target number.
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 20;
        int ans = ceilingBinarySearch(arr, target);
        System.out.println("Index: " + ans);
    }

    // Ceiling is the lowest number that is greater than or equal to the target element
    // This function uses binary search on an array to find the ceiling of a number
    static int ceilingBinarySearch(int[] arr, int target) {
        // If target is greater than the greatest number in the array
        if (target > arr.length - 1) {
            return -1;
        }

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
        return start;
    }
}
