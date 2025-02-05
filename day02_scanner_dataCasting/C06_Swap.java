package day02_scanner_dataCasting;

import java.util.Scanner;

public class C06_Swap {
    public static void main(String[] args) {
        // Question 7 (Interview) - Get two numbers from the user and swap their values.

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the first integer:");
        int number1 = scan.nextInt();

        System.out.println("Please enter the second integer:");
        int number2 = scan.nextInt();

        System.out.println("Before swapping - number1: " + number1 + ", number2: " + number2);

        // Swap logic using a temporary variable
        int temp = number2;
        number2 = number1;
        number1 = temp;

        System.out.println("After swapping - number1: " + number1 + ", number2: " + number2);
    }
}
