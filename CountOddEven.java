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
 *****************************************************************************
 */
public class CountOddEven {

    // Driver Code 
    public static void main(String[] args) {

        int number;
        System.out.print("Number: ");        
        Scanner scan = new Scanner(System.in);
        number = scan.nextInt();

        int even_count = 0;
        int odd_count = 0;

        while (number > 0) {

            int reminder = number % 10;

            if (reminder % 2 == 0) {
                even_count++;
            } else {
                odd_count++;
            }

            number = number / 10;
        }

        System.out.println("Even digit : " + even_count);
        System.out.println("Odd digit : " + odd_count);
    }
}
