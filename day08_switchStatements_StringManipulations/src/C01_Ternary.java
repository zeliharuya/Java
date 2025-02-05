import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {
        /*
        ullanicidan bir tamsayi alin
        sayi pozitifse, cift sayi veya cift ayi degil seceneklerinden uygun olani yazdirin
        sayi pozitif degilse, 3 basamakli veya 3 bsamakli degil seceneklerinden uygun olani yazdirin

         */

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir tamsayi giriniz");
        int sayi= scan.nextInt();

        String sonuc = sayi>0 ? //sart
                (sayi%2==0 ? "Cift sayi" : "Cift sayi degil") : //sart dogru ise calisacak kod
                (sayi<=-100 && sayi>=-999 ?  "3b^basamakli" : "3 basamakli degil ");

        System.out.println(sonuc);
    }
}

