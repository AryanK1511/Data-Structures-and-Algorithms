package com.company;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        // This program demonstrates the implementation of Order-agnostic binary search
        int[] arrAsc = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89}; // Ascending
        int[] arrDes = {89, 45, 22, 18, 16, 15, 4, 3, 2, 0, -4, -12, -18}; // Descending
        int target = 18;

        // For Ascending order array
        int ansAsc = orderAgnosticBS(arrAsc, target);
        System.out.println("Index Asc: " + ansAsc);

        // For Descending order array
        int ansDes = orderAgnosticBS(arrDes, target);
        System.out.println("Index Des: " + ansDes);
    }

    // This function iterates through an array and return's the target's index
    // Return -1 if item not found
    static int orderAgnosticBS(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

        // Find whether the array is sorted in ascending or descending order
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            // Find the middle element
            // int mid = (start + end) / 2;  // Might cause Overflow
            int mid = start + ((end - start) / 2); // This is a better approach as it does not cause overflow

            if (arr[mid] == target) {
                // Answer Found
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            else {
                if (target > arr[mid]) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        // If no answer is found
        return -1;
    }
}
