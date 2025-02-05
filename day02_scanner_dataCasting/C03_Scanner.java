package day02_scanner_dataCasting;

import java.util.Scanner;
public class C03_Scanner {
    public static void main(String[] args) {
        /* soru 2 kullanicidan bir double, bir de int sayi alip bunlarin toplamini ve carpimini
        yazdirin.   */
        Scanner scan = new Scanner (System.in);

        System.out.println("Lütfen bir tam sayi giriniz");
        int tamsayi=scan.nextInt();

        System.out.println("Lütfen ondalikli bir sayi giriniz");
        double ondalikliSayi= scan.nextDouble();

        System.out.println("girilen sayilarin carpimi : " + tamsayi+ondalikliSayi);
        System.out.println("girilen sayilarin carpimi : " + (tamsayi+ondalikliSayi));
    }
}
