package com.company;

/*

Question 01:
* * * *
* * * *
* * * *
* * * *

*/

import java.util.Scanner;

public class Pattern01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= 4; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
