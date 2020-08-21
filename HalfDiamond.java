/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testapp1;

import java.io.*;
import java.util.Scanner;

/**
 * *****************************************************************************
 *
 * @author Tehetena
 * ****************************************************************************
 */
public class HalfDiamond {

    // Function to print the 
// half diamond star pattern 
    static void halfDiamondStar(int N) {

        int i, j;

        // Loop to print the upper half diamond pattern 
        for (i = 0; i < N; i++) {
            for (j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        // Loop to print the lower half diamond pattern 
        for (i = 1; i < N; i++) {
            for (j = i; j < N; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    // Driver Code 
    public static void main(String[] args) {

        int number;
        System.out.print("Number 1: ");
        Scanner scan = new Scanner(System.in);
        //number = scan.nextInt();

        int N = 7;
        // Function Call 
        halfDiamondStar(N);

    }
}
