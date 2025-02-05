package day02_scanner_dataCasting;

public class C08_DataCasting {
    public static void main(String[] args) {

        double doubleNumber = 23.4;

        int intNumber = (int) doubleNumber; // Explicit narrowing (data loss occurs)
        System.out.println(intNumber); // 23

        // Print the average of three integers

        int number1 = 12;
        int number2 = 13;
        int number3 = 16;

        System.out.println((number1 + number2 + number3) / 3); // 41 / 3 = 13.6666 => 13
        /*
        If all numbers in the calculation are integers, Java provides the result as an integer.
        However, if one of the numbers is a double, Java automatically casts the result to the wider data type (double).
        */

        double number4 = 15;
        System.out.println((double) (number1 + number2 + number3) / 3); // 13.6666
    }
}
