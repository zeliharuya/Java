package day02_scanner_dataCasting;

public class C08_DataCasting {
    public static void main(String[] args) {

        double doubleSayi=23.4;

        int intSayi= (int)doubleSayi;
        System.out.println(intSayi); //23

        //verilen 3 tamsayinin, ortalamasini yazdirin

        int sayi1=12;
        int sayi2=13;
        int sayi3=16;

        System.out.println((sayi1+sayi2+sayi3)/3); //41/3 = 13.66666 =>13
        /*
        Eger islem yapilan bütün sayilar int ise java soncu da integer olarak verir.
        ama sayilardan biri double olursa, sonucu genis olana otomatik casr eder
         */
        double sayi4=15;
        System.out.println((double)(sayi1+sayi2+sayi3)/3);

        System.out.println((double)(sayi1+sayi2+sayi3)/3);

    }
}
