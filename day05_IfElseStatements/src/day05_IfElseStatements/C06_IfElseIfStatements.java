package day05_IfElseStatements;

import java.util.Scanner;

public class C06_IfElseIfStatements {
    public static void main(String[] args) {
        /*
        ögrencinin notu 85 ve üstü AA
        85 ve üstü degildse, 65 ve üstü ise BB
        65 ve üstü de degilse, 50 ve üstü ise CC,
        geriye kalanlar DD
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz");
        double not = scan.nextDouble();

        if (not>=85) System.out.println("AA");
        else if (not>=65) System.out.println("BB");
        else if (not>=50) System.out.println("CC");
        else System.out.println("DD");
    }
}
