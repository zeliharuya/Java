public class C09_equalsIgnoreCase {
    public static void main(String[] args) {
        /*
        equalsIgnoreCase() verilen iki String'in metinsel esitligine
        büyük-kücük harf hassasiyeti olmadan bakar
         */

        String isim1 = "Kadir";
        String isim2 = "kadir";
        String isim3 = "kadir ";

        System.out.println(isim1.equals(isim2)); //false
        System.out.println(isim1.equals(isim2)); //true

        System.out.println(isim1.equals(isim3)); //false
        System.out.println(isim1.equalsIgnoreCase(isim3)); //false

    }
}
