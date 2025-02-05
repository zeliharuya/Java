package day02_scanner_dataCasting;

public class C09_DataCasting {
    public static void main(String[] args) {

        int intNumber = 200;

        byte byteNumber = (byte) intNumber; // Explicit narrowing (possible data loss)
        System.out.println("If we convert intNumber: " + intNumber + " to byte, its value becomes: " + byteNumber); // 116

        /*
        1- If we assign a smaller data type to a larger data type variable, Java automatically widens it.
        2- If we assign a larger data type to a smaller data type variable, 
           Java does not perform the conversion automatically and requires us to take responsibility.
           - This can lead to data loss (e.g., decimal parts being removed).
           - Or, unexpected transformations may occur due to overflow.
        */
    }
}

