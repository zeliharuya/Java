public class C14_substring_terstenyazdirma {
    public static void main(String[] args) {
        //verilen dört basakli bir string'i terse cevviren bir program yaziniz

        String str="Java";

        String tersStr= str.substring(3)+
                        str.substring(2,3)+
                        str.substring(1,2)+
                        str.substring(0,1);

        System.out.println(tersStr);

    }
}
