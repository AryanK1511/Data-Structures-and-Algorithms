package com.company;

/*

Question 02:
*
* *
* * *
* * * *

*/

import java.util.Scanner;

public class Pattern02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
