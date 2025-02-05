import java.util.Scanner;

public class C03_SwitchCase {
    public static void main(String[] args) {
        /*
        kullanicidan gün ismini alin
        ve girilen gü ismine göre tatilMi variable'ini hafta sonu icin true
        hafta ici ici false olarak atayin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen gün ismini giriniz");
        String gunIsmi = scan.next().toLowerCase();
        /*
        string ifadeler case-sensitiv'dir
        (büyük ve kücük harf duyarlidir)
        pazartesi, pazartesi, PAZARTESI, PAzartesi ..... hep farkli String'lerdir.
         */

        boolean tatilMi = false;

        switch (gunIsmi) {
            case "pazartesi" :
            case "sali" :
            case "carsamba" :
            case "persembe"  :
            case "cuma" :
                tatilMi=false;
                break;
            case "cumartesi" :
            case "pazar" :
                tatilMi=true;
                break;
            default:
                System.out.println("gecersiz gün ismi");
        }

        if (tatilMi) System.out.println("yazdiginiz gün " + gunIsmi + "iyi dinlenin");
        else System.out.println("yazdiginiz gün " + gunIsmi + "calisma zamani");
    }
}
