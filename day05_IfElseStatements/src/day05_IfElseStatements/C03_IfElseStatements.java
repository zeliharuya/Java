package day05_IfElseStatements;

import java.util.Scanner;

public class C03_IfElseStatements {
    public static void main(String[] args) {

        //Soru 1- Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli
        //olabilir. Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin” veya “Emekli olmak icin .. Yil
        //daha calisman gerekir” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen ücgenin kenarlarini tamsayi olarak giriniz");
        int kenar= scan.nextInt();
        int kenar2= scan.nextInt();
        int kenar3= scan.nextInt();

        if (kenar==kenar2 && kenar2==kenar3){
            System.out.println("Girilen kenar uzunluklari eskenar bir ücgen olusturur");

        }else {
            System.out.println("Girilen kenar uzunluklari eskenar bir ücgen olusturmaz");
        }



    }



}
