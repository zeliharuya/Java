package day05_IfElseStatements;


import java.util.Scanner;

public class C05_IfElseStatements {

    public static void main(String[] args) {
        //Soru 4- Kullanicidan bir karakter girmesini isteyin, girilen karakterin buyuk harf olup olmadigini
        //yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz");
        char girilenChar=scan.next().charAt(0);

        if (girilenChar>='a' && girilenChar<='z'){
            System.out.println((char)(girilenChar-32));

        }else{
            System.out.println(girilenChar);

        }




    }
}
