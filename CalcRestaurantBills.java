

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
public class CalcRestaurantBills {

    /**
     * @param args the command line arguments
     */
     public static void main(String []args){
        System.out.println("Hello World");
        
        float firstProduct, secondProduct, thirdProduct, taxPercentage, taxAmount;
        Scanner scan = new Scanner(System.in);
        System.out.print("Price 1: ");
        firstProduct = scan.nextFloat();
        System.out.print("Price 2 : ");
        secondProduct = scan.nextFloat();
        System.out.print("Price 3 : ");
        thirdProduct = scan.nextFloat();
        System.out.print("tax % : ");
        taxPercentage = scan.nextFloat();
        scan.close();
        
        taxAmount = ( taxPercentage/ 100) *(firstProduct * secondProduct * thirdProduct);
        System.out.print("Final Amount: " +taxAmount);
     }    
}
