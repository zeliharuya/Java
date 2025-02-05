import java.util.Locale;

public class C06_switchStatements_tUpperCase {
    public static void main(String[] args) {
        //String'i istedigimiz ekilde büyük har veya kücük harfe cevirebiliriz

        String str= "Java candir";

        System.out.println(str.toUpperCase()); //JAVA CANDIR

        System.out.println(str); //Java candir

        //eger kalici olarak degisiklik yapmak istersek, atama yapmaliyiz

        str=str.toUpperCase();
        System.out.println(str); //JAVACANDIR

        System.out.println(str.toLowerCase()); //Java candir

        // eger büyük kücük harf cevirirken, bir dile göre yapmak isterseniz

        System.out.println(str.toLowerCase(Locale.GERMAN));//java candir
        System.out.println(str.toLowerCase(Locale.forLanguageTag("Tr")));//java candir

        str=str.toLowerCase();
        System.out.println(str.toUpperCase(Locale.forLanguageTag("Tr")));


    }
}
