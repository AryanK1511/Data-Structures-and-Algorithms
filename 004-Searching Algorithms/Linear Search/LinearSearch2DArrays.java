package com.company;
import java.util.Arrays;

public class LinearSearch2DArrays {
    // This program is used to implement linear search in 2D arrays. You can modify this program to finding max and min elements etc. in 2D arrays by the same logic.
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        int target = 34;
        int[] ans = search(arr, target); // Format of return value {row, col}
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target) {
        // Iterating through the 2D Array
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[] {row, col}; // This syntax is used to create a new object
                }
            }
        }
        return new int[] {-1, -1};
    }
}
