package day06_nestedIfElse_Ternary;

import java.util.Scanner;

public class C03_NestedIfElse_Emeklilik1 {
    public static void main(String[] args) {
        /*
        Soru 1- Kullanicidan cinsiyetini ve yasini alin,
        kadin, 60 yas ve üzeri , erkek 65 yas ve üzeri emekli olabilir.
        cinsiyt ve yasini dikate alarak "Emekli olabilirsin"
        veya "emekli olmak icin .. yil daha calismam gerekir" yazdirin


        eger degisken sayimiz birden fazla ise
        önce degiskenlerden birine göre temel iskeleti kuralim

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen kadin icin K, Erkek icin E giriniz");
        char cinsiyet = scan.next().toUpperCase().charAt(0);
        System.out.println("lütfen yasinizi giriniz");
        double yas = scan.nextDouble();


        if (cinsiyet == 'K') { // Kadın bloğu
            if (yas < 0) {
                System.out.println("Yaş sıfırdan küçük olamaz");
            } else if (yas < 60) {
                System.out.println("Emekli olamazsın, daha gençsin");
            } else {
                System.out.println("Emekli olabilirsin");
            }
        } else if (cinsiyet == 'E') { // Erkek bloğu
            if (yas < 0) {
                System.out.println("Yaş sıfırdan küçük olamaz");
            } else if (yas < 60) {
                System.out.println("Emekli olamazsın, daha gençsin");
            } else {
                System.out.println("Emekli olabilirsin");
            }
        } else {
            System.out.println("Giriş bilgilerinizi kontrol edin");
        }


    }
}
