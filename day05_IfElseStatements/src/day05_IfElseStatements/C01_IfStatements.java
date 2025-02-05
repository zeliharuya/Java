package day05_IfElseStatements;

import java.util.Scanner;

public class C01_IfStatements {

    public static void main(String[] args) {
        // basit if cümleleri ile ilgili örnek
        //Soru 5- Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        //yoksa girilen harfi yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz");

        double not= scan.nextDouble();

        if (not>=50) {
            System.out.println("Sinifi gectin");

        }
        if (not<50){
            System.out.println("Maalesef kaldin");

        }


    }
}
