package day03_matematikselIslemler_Increment;

import java.util.Scanner;

public class C01_Casting {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan bir sayi alin, kullanici kac degerini girerse girsin, o sayiyi -128 ile 127
        //arasindaki bir sayiya donusturup yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        double girilenSayi= scan.nextDouble();

        byte donusenSayi= (byte)girilenSayi; //sayiyi -128 il 127 arasina dönüstürmek icin byte'a dönüstür

        System.out.println("Girdiginiz sayinin sistemindeki karsiligi : " + donusenSayi);

    }
}