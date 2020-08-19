/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testapp1;

import java.util.Scanner;

/**
 *
 * @author Tehetena
 */
public class SolvePrintingMistakes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String str1, str2, newStr = null;
        char tempFist, tempsecond;
        int str2Len, str2LenTotal;

        //do {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first string (string must be at least 4 characters");
        str1 = scan.nextLine();
        System.out.print("Enter the secound string (string must be at least 4 characters");
        str2 = scan.nextLine();

        //  str1.length(); str2.length();
        str2Len = str2.length();
        str2LenTotal = str2.length();
        
        char[] firstStr = new char[str1.length()]; 
        char[] secondStr = new char[str2.length()]; 
        firstStr= str1.toCharArray();   
        secondStr= str2.toCharArray();   
        
        tempFist =firstStr[0];
        tempsecond = firstStr[1];
        
        firstStr[0] = secondStr[str2.length()-2];
        firstStr[1] = secondStr[str2.length()-1];
        
        
        secondStr[str2.length()-2] = tempFist;
        secondStr[str2.length()-1] = tempsecond;
        
        str1 = String.valueOf(firstStr);
        str2 = String.valueOf(secondStr);
        
        System.out.println(" The correct version of First String ===>" + str1);
        System.out.println(" The correct version of Second String ===>" + str2);
    }
}
