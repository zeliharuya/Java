import java.util.Scanner;

public class C05_SwitchCase {
    public static void main(String[] args) {
        // soru 6- kullanicidan ay ismini alip mevsimi yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen ay ismini yaziniz");
        String girilenAyIsmi= scan.next();

        /*
        kullanici ay ismini farkli sekillerde yazabilecegi icin
        biz girilen degeri standartlastirmak icin
        yeni bir variable'a kücük harf olarak atayalim

        switch statement inda long, double, float ve boolean kullanilamaz
         */

        String ayIsmi= girilenAyIsmi.toLowerCase();

        switch (ayIsmi){
            case "aralik" :
            case "ocak" :
            case "subat" :
                System.out.println("girdiginiz "+ girilenAyIsmi + "ayi kis mevsiminde");
                break;
            case "mart" :
            case "nisan" :
            case "mayis" :
                System.out.println("girdiginiz "+ girilenAyIsmi + "ayi ilk bahar mevsiminde");
                break;
            case "haziran" :
            case "temmuz" :
            case "agustos" :
                System.out.println("girdiginiz "+ girilenAyIsmi + "ayi yaz mevsiminde");
                break;
            case "eylül" :
            case "ekim" :
            case "kasim" :
                System.out.println("girdiginiz "+ girilenAyIsmi + "ayi sonbahar mevsiminde");
                break;
            default:
                System.out.println("gecersiz ay ismi");
        }
    }
}
