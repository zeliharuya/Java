import java.util.Scanner;

public class C08_equals {
    public static void main(String[] args) {
        /*
        kullanicidan gün ismini alin
        ve girilen gü ismine göre

        hafta ici veya hafta sonu yazdirin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen gün ismini yaziniz");
        String gunIsmi= scan.next();
        String gun = gunIsmi.toLowerCase();

        if (gun.equalsIgnoreCase("pazartesi") || gun.equalsIgnoreCase("sali") || gun.equalsIgnoreCase("carsamba")
                || gun.equalsIgnoreCase("persembe") || gun.equalsIgnoreCase("cuma")) {
            System.out.println("hafta ici");
        } else if (gun.equalsIgnoreCase("cumartesi") || gun.equalsIgnoreCase("pazar")) {
            System.out.println("hafta sonu");
        }else{
            System.out.println("gecersiz gün ismi");
        }
    }
}
