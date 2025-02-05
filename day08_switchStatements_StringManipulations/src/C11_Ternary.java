public class C11_Ternary {
    public static void main(String[] args) {
        //string kac karakterden olusturdugunu(uzunluk) bize dondurur

        String str= "Uzunkavaklaratindayataruyumazoglu";

        System.out.println(str.length()); //35

        // bu string'in son karakterini yazdirin

        System.out.println(str.charAt(str.length()-1)); // u

        //sondan 3. karakteri yazdirin

        System.out.println(str.charAt(str.length()-3)); //g


    }
}
