package day06_nestedIfElse_Ternary;

import java.util.Scanner;

public class C04_NestedIfElse_Emeklilik2 {
    public static void main(String[] args) {
                /*
        Soru 1- Kullanicidan cinsiyetini ve yasini alin,
        kadin, 60 yas ve üzeri , erkek 65 yas ve üzeri emekli olabilir.
        cinsiyt ve yasini dikate alarak "Emekli olabilirsin"
        veya "emekli olmak icin .. yil daha calismam gerekir" yazdirin


        eger degisken sayimiz birden fazla ise
        önce degiskenlerden birine göre temel iskeleti kuralim
        örnegin bu soruda yasa göre yapalim

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen kadin icin K, Erkek icin E giriniz");
        char cinsiyet = scan.next().toUpperCase().charAt(0);
        System.out.println("lütfen yasinizi giriniz");
        double yas = scan.nextDouble();

        if (yas<0) {
            System.out.println("yas sifirdan kücük olamaz");
        } else if (yas<65) { //kimse emekli olamaz
            if (cinsiyet=='K'){
            System.out.println();
        } else if (yas<60){

        }
    }
}
