
public class C13_substring {
    public static void main(String[] args) {

        String str= "Java Güzeldir";

        System.out.println(str.substring(1, 3));// av

        System.out.println(str.substring(5,10)); // Güzel

        System.out.println(str.substring(0,12)); // Java Güzeldi

        //son 3 karakter haric tüm metni yazdir

        System.out.println(str.substring(0, str.length()-3));

    }
}
