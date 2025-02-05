package day02_scanner_dataCasting;

import java.util.Scanner;

public class C10_CharYazdirma {
    public static void main(String[] args) {

        // Question 2 - Get a letter from the user and print the next three letters in the alphabet.
        //ASCII table is used to clarify this question
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a letter:");
        char enteredLetter = scan.next().charAt(0);

        System.out.println("Entered letter: " + enteredLetter);

        // Corrected output using type casting to char
        System.out.println("The letter after the entered letter: " + (char) (enteredLetter + 1));
        System.out.println("The letter two places after: " + (char) (enteredLetter + 2));
        System.out.println("The letter three places after: " + (char) (enteredLetter + 3));
    }
}
