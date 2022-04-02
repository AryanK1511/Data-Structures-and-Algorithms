package com.company;

/*

Question 06:
     *
    * *
   * * *
  * * * *
 * * * * *
  * * * *
   * * *
    * *
     *

*/

import java.util.Scanner;

public class Pattern06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int mid = (n*2 - 1) / 2;

        for (int row = 1; row <= 2*n - 1; row++) {
            if (row <= mid) {
                for (int col1 = 1; col1 <= mid + 1 - row; col1++) {
                    System.out.print(" ");
                }
                for (int col1Star = 1; col1Star <= row; col1Star++) {
                    System.out.print("* ");
                }
            }
            else {
                for (int col2 = 1; col2 <= row - mid - 1; col2++) {
                    System.out.print(" ");
                }
                for (int col2Star = row - mid; col2Star <= mid + 1; col2Star++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
