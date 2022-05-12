package com.company;

public class EvenDigits {
    // Q) Find the amount of numbers that have an even number of digits. For eg) 5671, 89 etc.
    public static void main(String[] args) {
        int[] nums = {34, 5671, 89, 654892, 7, 123, 219, 98};
        int ans = findNumbers(nums);
        System.out.println("Count of numbers with even digits: " + ans);
    }

    // Function to count the numbers with even number of digits
    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums)  {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    // Function to check whether a number contains even digits or not
    static boolean even(int num) {
        int count = 0;

        while (num > 0) {
            count++;
            num = num / 10;
        }

        if (count % 2 == 0) {
            return true;
        }
        return false;
    }
}
