public class C12_substring {
    public static void main(String[] args) {
        //substring(): verilen bir String'in istenen bit parcasini bie döndürür

        String str= "Java Güzeldir";

        System.out.println(str.substring(2)); // va Güzeldir

        //son 3 karakteri yazdirin

        System.out.println(str.substring(10)); //dir

        System.out.println(str.substring(str.length()-3));
        //dinamik oldugu icin bu sekilde yazilmasi daha iyidir

        System.out.println(str.substring(str.length()-1));

        System.out.println(str.substring(str.length())); // java hiclik dondurur

        // System.out.println(str.substring(14)); //StringIndexOutOfBoundsException

        System.out.println(str.substring(0)); //Java Güzeldir

    }
}
