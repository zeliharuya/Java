package day05_IfElseStatements;

import java.util.Scanner;

public class C07_IfElseIfStatements {
    public static void main(String[] args) {
        /*
        soru 4
        kullanicidan mesafeyi kiloetre olarak alin ve cevirmek istedigi birimi
        sorum, istedigi birim metre veya cm ise civirip yazdirin,
        eger yoksa istediginiz birim kayitli degil yazdirin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Cevirmek istediginiz mesafeyi km olark yazin");
        int mesafeKm= scan.nextInt();
        System.out.println("Cevirmek stediginiz birimi secin " + "\nM : Metre >nS : Santimetre");
        char tercih=scan.next().charAt(0);

        if (tercih=='M' || tercih=='m') {
            System.out.println("girilen mesafenin metre olarak karsiligi : " + mesafeKm * 1000);
        } else if (tercih=='S' || tercih=='s') {
            System.out.println("girilen mesafenin santimetre olarak karsiligi : " + mesafeKm*1000000);
        } else {
            System.out.println("istediginiz birim sisteme kayitli degil");
        }
    }
}
