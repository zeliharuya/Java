package day03_matematikselIslemler_Increment;

public class C05_Pre_Post_Increment {
    public static void main(String[] args) {
        /*
        Sayi degerini kalici olarak 1 artirirken sayi++, 1 azaltirken sayi-- kullanabilecegimizi gormustuk.
++ ve -- sayidan once de kullanilabilir, sonuc yine ayni olacaktir.

        Pre-Increment veya Pre-Decrement ile Post-Increment ve Post-Decrement arasindaki fark, bu islem
        farkli bir islem ile birlikte kullanilirsa ortaya cikar
         */

        int a=10;
        System.out.println(a++); //10
        System.out.println(a); //11

        a=10;
        System.out.println(++a); //11
        System.out.println(a); //11

        a=10;
        int b= a++; // b=10 , a=11

        System.out.println("a : " + a + "b : " + b);

        a=10;
        b= ++a; // a=11, b=11
        System.out.println("a : " + a + ".b : " + b);

    }
}
