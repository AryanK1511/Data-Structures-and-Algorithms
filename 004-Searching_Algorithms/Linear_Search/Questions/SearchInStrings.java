package com.company;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Aryan";
        char target = 'r';

        // Used for search() Function
        System.out.println("The target was found: " + search(name, target));

        // Used for forEachSearch() Function
        System.out.println("The target was found: " + forEachSearch(name, target));

    }

    static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        // Using a for loop
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    static boolean forEachSearch(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        // Using a for-each loop
        for (char ch : str.toCharArray()) { // toCharArray() converts string to array - [A, r, y, a, n]
            if (ch == target) {
                return true;
            }
        }
        return false;
    }
}
