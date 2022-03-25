package com.company;

public class SmallestLetter {
    public static void main(String[] args) {
        // Q) Find the smallest character in the character array given which is greater than or equal to the target element
        char[] arr = {'c', 'f', 'j'};
        char target = 'j';
        char ans = smallestLetterBinarySearch(arr, target);
        System.out.println(ans);
    }

    // This function uses binary search to find the 'ceiling of a character'
    static char smallestLetterBinarySearch(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + ((end - start) / 2);

            if (target < letters[mid]) {
                end = mid - 1;
            }

            else {
                start = mid + 1;
            }
        }

        // The letters wrap around. That means 'j' should output 'c'
        return letters[start % letters.length];
    }
}
