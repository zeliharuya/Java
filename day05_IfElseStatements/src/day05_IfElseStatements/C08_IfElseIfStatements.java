package day05_IfElseStatements;

import java.util.Scanner;

public class C08_IfElseIfStatements {
    public static void main(String[] args) {
        /*
        soru 2
        kullanicinin kg ve cm isteyip vücut kitle endeksini hesaplayin
        kilo*10000 / boy*boy
        ücut kitle endeksi 30'dan byükse obez
        25-30 arasi ise kilolu
        20-25 arasi ise normal
        20'den kücükse zayif yazdirin

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen kg olarak kilonuzu girin");
        double kilo= scan.nextDouble();
        System.out.println("lütfen cm olarak boyunuzu giribn");
        double boy= scan.nextDouble();

        double vke=kilo*10000/(boy*boy);

        System.out.println("vücut kitle endeksiniz : " + vke);


        if (vke >= 30) {
            System.out.println("Obez");
        } else if (vke >= 25) {
            System.out.println("Kilolu");
        } else if (vke >= 20) {
            System.out.println("Normal");
        } else {
            System.out.println("Zayıf");
             }
    }
}
