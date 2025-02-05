package day02_scanner_dataCasting;

import java.util.Scanner;

public class C04_Scanner {
    public static void main (String[] args)  {
        /*Soru 3- Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
Isminiz : John
Soyisminiz : Doe
Yasiniz : 44
Kaydiniz basariyla tamamlanmistir. */
//Scanner java'da kullanicilardan bilgi alabilmek icin java.util kütüphanesinden Scanner class'ini kullaniriz.


        Scanner scan = new Scanner(System.in);

        System.out.println("isminizi giriniz");

        String isim=scan.nextLine();

        System.out.println("lütfen soyisminizi giriniz");
        String soyisim=scan.nextLine();

        System.out.println("lütfen yasinizi giriniz");
        String yas= scan.nextLine();

        System.out.println("isminiz: " + isim + "\nSoyisminiz: " + soyisim + "\nYasiniz: " + yas );
        /*
        String ile scan.next() ve scan.nextLine() kullanilabilir.
        next() sadece ilk space'e kadar olan kismi alirken
        nextLine() tüm satiri alir

        Arka arkaya birden fazla String degeri kullanicidan alinacaksa hata olmamasi
        icn nextLine() kullanilmasi daha iiyi olur.

        + satirlarin önemi yoktur ve mesela parantezlerin bitimine kadar dogru sayar.
         */

    }
}
