package day02_scanner_dataCasting;

import java.util.Scanner;

public class C02_Scanner  {
    /*/* Scanner kullanabilmek icin 3 adim
        1 scanner i kullanmak istedigimiz class'da  kere scanner objesi olusturmaliyiz
        Scanner scan = new Scanner(System.in)
        2 kullanciya ne istedigimize dair bilgi vermeliyiz.
        3 alacagimiz datayi iine koyabilecegimiy bir variable olusturup, scanner class'indeki hazir method'larla
        kullanicidan istedigimiz bilgiyi almaliyiz.
         */

    public static void main (String[] args) {
    /* birinci adim scanner obeji olusturma */
        Scanner scan = new Scanner(System.in);
        // ikinci kullanicidan ne istedigimizi kullaniciya söyleyelim
        System.out.println("Lütfen bir tamsayi giriniz");
        /* 3. adim: istedigimiz datayi koyabilecegimiz bir variable olusturup kullanicinin
        girdigi degeri uygun method'la alalim ve
        olusturdugumuz variable'a atayalim.
         */

        int girilenSayi= scan.nextInt();
        System.out.println("Girdiginiz sayinin kupu : " + (girilenSayi)*girilenSayi*girilenSayi);
    }
}
