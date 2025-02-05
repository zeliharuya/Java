package day02_scanner_dataCasting;

import java.util.Scanner;

public class C04_Scanner {
    public static void main (String[] args)  {
        /* Question 3: 
           Get the user's first name, last name, and age, then print them in the following format:
           
           Name: John  
           Surname: Doe  
           Age: 44  
           Your registration has been successfully completed.
        */

        // In Java, to receive input from users, we use the Scanner class from the java.util library.

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your first name:");
        String firstName = scan.nextLine();

        System.out.println("Please enter your last name:");
        String lastName = scan.nextLine();

        System.out.println("Please enter your age:");
        String age = scan.nextLine();

        System.out.println("Name: " + firstName + "\nSurname: " + lastName + "\nAge: " + age);
        
        /*
        In Java, both scan.next() and scan.nextLine() can be used for Strings.
        - next() only takes the part before the first space.
        - nextLine() takes the entire line.

        If multiple String values are to be taken consecutively from the user, 
        using nextLine() is better to avoid issues.

        + The order of the lines does not matter, 
          for example, it correctly processes until the closing parentheses.
        */
    }
}
