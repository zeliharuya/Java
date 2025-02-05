package day03_matematikselIslemler_Increment;

public class C06_Pre_Post_Increment {
    public static void main(String[] args) {

        int a=10;
        System.out.println("a'nin degeri : " + ++a);

        int b= a++; // önce atama yap, sonra degeri arttir
        System.out.println("b'nin degeri : " + b);

        int c= b++ + a; // önce atama c=11+12 = 23 , b=12
        System.out.println("c'nin degeri : " + c); // 23
        System.out.println("Son toplam : " + (a+b+c)); //47
    }
}
