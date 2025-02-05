package day03_matematikselIslemler_Increment;

import java.util.Scanner;

public class C03_RakamlarToplama {
    public static void main(String[] args) {
        //Soru 1- Kullanicidan 4 basamakli pozitif bir tamsayi alip rakamlar toplamini bulalim
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 4 basamakli pozitif bir tamsayi giriniz");
        int girilenSayi= scan.nextInt();

        /*
        bu soruyu ileride loop ile yapacagiz
        ama simdiik ayni islemi basaak sayisi kadar kendimiz tekrar ettirecegiz.

        Java'da bir kod yazmaya baslamadan nce algoritmayi tasarlayip ihtiyacimiz olan variable'lari olusturmaliyiz.
         */

        int birlerbasamagi=0;
        int rakamlarToplami=0;

        // sayi : 1649 , birlerbasamagi=0 , rakamlarToplami=0

        birlerbasamagi=girilenSayi%10;
        rakamlarToplami=rakamlarToplami+birlerbasamagi; // 0+9=0
        girilenSayi = girilenSayi/10; //146

        // sayi : 146 ; birlerBasamagi=9 , rakamlarToplami=9

        birlerbasamagi=girilenSayi%10; //6
        rakamlarToplami=rakamlarToplami+birlerbasamagi; // 9+6=15
        girilenSayi = girilenSayi/10; //14



        // sayi : 14 ; birlerBasamagi=6 , rakamlarToplami=15

        birlerbasamagi=girilenSayi%10; //4
        rakamlarToplami=rakamlarToplami+birlerbasamagi; // 15+4=19
        girilenSayi = girilenSayi/10; //1

        // sayi : 1 ; birlerBasamagi=4 , rakamlarToplami=19

        birlerbasamagi=girilenSayi%10; //1
        rakamlarToplami=rakamlarToplami+birlerbasamagi; // 19+1=20
        girilenSayi = girilenSayi/10; //,1 ==>0

        System.out.println("Girilen sayinin rakamlar toplami : ");



    }
}
