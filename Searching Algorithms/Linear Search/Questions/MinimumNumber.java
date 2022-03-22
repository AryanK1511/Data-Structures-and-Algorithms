package com.company;

public class MinimumNumber {
    public static void main(String[] args) {
        int[] arr = {3, 28, -2, 81, -35, 92, 54, 8, -6};
        System.out.println("Minimum Number in Array : " + min(arr));
    }

    // Assume arr.length != 0
    // Return the minimum value in the array
    static int min(int[] arr) {
        int ans = arr[0];
        // Using a for-each loop
        for (int element : arr) {
            if (element < ans) {
                ans = element;
            }
        }
        return ans;
    }
}
