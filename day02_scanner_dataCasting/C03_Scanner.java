package day02_scanner_dataCasting;

import java.util.Scanner;
public class C03_Scanner {
    public static void main(String[] args) {
        /* Question 2: 
           Get a double and an integer from the user and print their sum and product.
        */
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter an integer:");
        int integerNumber = scan.nextInt();

        System.out.println("Please enter a decimal number:");
        double decimalNumber = scan.nextDouble();

        System.out.println("The sum of the entered numbers: " + (integerNumber + decimalNumber));
        System.out.println("The product of the entered numbers: " + (integerNumber * decimalNumber));
    }
}
