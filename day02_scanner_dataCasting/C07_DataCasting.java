package day02_scanner_dataCasting;

public class C07_DataCasting {
    public static void main(String[] args) {
        /* Data conversion refers to assigning data of one type to a variable of another type.
           Not all data types can be converted to each other.
           For example, a boolean cannot be converted to another data type, 
           nor can other data types be converted to boolean.

           Similar data types and those with a parent-child relationship can be converted to each other.
           However, Java sometimes performs these conversions automatically, and other times it requires approval from the programmer.

           Auto-widening (automatic): 
           When converting a smaller data type to a larger data type, 
           Java performs the conversion automatically.
           For example, assigning an int, short, or long value to a double variable is done automatically.

           Explicit-narrowing: 
           When converting a larger data type to a smaller one, there can be data loss or transformation issues.
        */

        String name = "Esra";
        name = "Ayse";

        // name = 's'; → A String variable cannot be assigned a boolean, int, or char value.

        boolean isGood = true;
        // isGood = 'r'; → A boolean variable cannot be assigned a String, char, or int value.

        int intNumber = 12;
        short shortNumber = 20;
        byte byteNumber = 21;
        double doubleNumber = 14;

        // Controlled transitions are possible among similar or related data types.

        doubleNumber = intNumber;  // Small to large (Auto-widening)
        intNumber = shortNumber;   // Small to large (Auto-widening)

        byteNumber = (byte) intNumber;   // Large to small (Explicit-narrowing)
        shortNumber = (short) doubleNumber; // Large to small (Explicit-narrowing)

        System.out.println(byteNumber);
        System.out.println(shortNumber);
    }
}
