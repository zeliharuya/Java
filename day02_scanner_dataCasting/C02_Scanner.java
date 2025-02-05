package day02_scanner_dataCasting;

import java.util.Scanner;

public class C02_Scanner  {
    /* Steps to use Scanner:
        1. We must create a Scanner object once in the class where we want to use it.
           Scanner scan = new Scanner(System.in);
        2. We must inform the user about what we want to receive as input.
        3. We must create a variable where we can store the data we will receive,
           and use the ready-made methods in the Scanner class to get the input from the user.
    */

    public static void main (String[] args) {
    /* Step 1: Create a Scanner object */
        Scanner scan = new Scanner(System.in);
        
        // Step 2: Inform the user about the expected input
        System.out.println("Please enter an integer:");

        /* Step 3: Create a variable to store the input data, 
           retrieve the value from the user using the appropriate method, 
           and assign it to the variable.
        */

        int enteredNumber = scan.nextInt();
        System.out.println("The cube of the number you entered: " + (enteredNumber * enteredNumber * enteredNumber));
    }
}
