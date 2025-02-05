package day03_matematikselIslemler_Increment;

public class C07_Pre_Post_Increment {
    public static void main(String[] args) {

        int a= 10;
        System.out.println(a); //11

        ++a;
        System.out.println(a); //11

        // yeni bir variable olusturun, a nin degerini yeni variable'a atayin
        // sonra a'nin degerini bir arttirin

        int b= a;
        a++;

        System.out.println("a'nin degeri : " + a + ",b' nin degeri : " + b); // a=13, b=12

        int c=a++;
        System.out.println("a'nin degeri : " + a + ",b' nin degeri : " + b +",c' nin degeri : " + c);


    }
}
