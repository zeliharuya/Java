package day02_scanner_dataCasting;

import java.util.Scanner;

public class C10_CharYazdirma {
    public static void main(String[] args) {

        // Soru 2- kullanicidan bir harf alin ve alfabede o harften sonraki 3 harfi yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir harf giriniz");
        char girilenHarf=scan.next().charAt(0);

        System.out.println("girilen harf: " +girilenHarf);

        System.out.println("girilen harften bir sonraki harf: " +girilenHarf+1);
        System.out.println("girilen harften iki sonraki harf: " +girilenHarf+2);
        System.out.println("girilen harften üc sonraki harf: " +girilenHarf+3);
    }
}
