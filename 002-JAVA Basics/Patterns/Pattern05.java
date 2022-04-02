package com.company;

/*

Question 05:
*
**
***
****
*****
****
***
**
*

*/

import java.util.Scanner;

public class Pattern05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int mid = (n*2 - 1) / 2;

        for (int row = 1; row <= 2*n - 1; row++) {
            if (row <= mid) {
                for (int col1 = 1; col1 <= row; col1++) {
                    System.out.print("*");
                }
            }
            else {
                for (int col2 = row - mid; col2 <= mid + 1; col2++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
