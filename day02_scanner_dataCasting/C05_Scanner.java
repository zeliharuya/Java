package day02_dataCasting;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        // Question 4: Get the lengths of two sides of a rectangle from the user and print its area.

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the two side lengths of the rectangle.\n" +
                           "Press Enter after entering the first side:");
        
        double side1 = scan.nextDouble();
        double side2 = scan.nextDouble();

        System.out.println("The area of the rectangle is: " + (side1 * side2));
    }
}
