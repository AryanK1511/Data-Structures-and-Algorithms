package com.company;

/*

Question 03:
****
***
**
*

*/

import java.util.Scanner;

public class Pattern03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int row = 1; row <= n; row++) {
            for (int col = n + 1 - row; col > 0; col--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
