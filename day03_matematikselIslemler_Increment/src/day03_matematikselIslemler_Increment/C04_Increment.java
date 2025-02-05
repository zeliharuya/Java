package day03_matematikselIslemler_Increment;

public class C04_Increment {
    public static void main(String[] args) {
        /*
        Toplama veya carpma yaparak bir variable’in degerini artirabiliriz.
        Increment isleminin kalici olmasi icin 3 farkli sekilde assignment yapilabilir.

         */

        int a=12;
        int b=8;
        a +=b;

        System.out.println("a : " + a + "b : " + b); // 20,8

        a--;
        b++;

        System.out.println("a : " + a + ", b : " + b); // 19, 9

        a/=b;
        System.out.println("a : " + a + ", b : " + b); // 2, 9

        b*=3;
        System.out.println("a : " + a + ", b : " + b); // 2, 27



    }
}
