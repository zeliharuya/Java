import java.util.Scanner;

public class C4_SwitchCase {
    public static void main(String[] args) {
        // soru 1- kullanicidan br rakam alip, rakami yaziyla yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir rakam giriniz");
        int rakam= scan.nextInt();

        switch(rakam){
            case 0:
                System.out.println("sifir");
                break;
            case 1:
                System.out.println("bir");
                break;
            case 2:
                System.out.println("iki");
                break;
            case 3:
                System.out.println("üc");
                break;
            case 4:
                System.out.println("dört");
                break;
            case 5:
                System.out.println("bes");
                break;
            case 6:
                System.out.println("alti");
                break;
            case 7:
                System.out.println("yedi");
                break;
            case 8:
                System.out.println("seki");
                break;
            case 9 :
                System.out.println("dokuz");
            default:
                System.out.println("rakam girmelisiniz");

        }
    }
}
