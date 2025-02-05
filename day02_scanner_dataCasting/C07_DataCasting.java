package day02_scanner_dataCasting;

public class C07_DataCasting {
    public static void main(String[] args) {
        /* bir datayi baska data türündeki vRIblw'a atayabilmek icin data türü degistirmeye denir.
        her data türü birbirine cevirilemez, örnegin boolean baska data türlerine cevrilemez ve baska data
        türleri boolean'a cevrilemez.
        Benzer data türleri ve parent-child iliskisi olan data türleri birbirlerine cevrilebilirler.
        Ancak Java bu cevirmeleri bazen otomatik, bazen de bizden onay bekler

        Auto-widening (otomatik) dar kapsamli bir data türündeki datayi daha genis kapsamli bir data türüne
        cevirmek isterek Java bunu otomatik olarak yapacaktir. örnegin double bir variable'a int, short
        veya long datat türündeki bir deger atadigimizda java otomatik yapar.

        explicit-narrowing: genis data türündeki datayi dar türüne cevirmek istersek, datat kayiplari
        veya dönüsüm olabilir.
         */

        String isim="Esra";

        isim="Ayse";

        //isim 's'; String br variable'a boolean, int veya char bir deger atayamazsiniz

        boolean iyiMi=true;

        // iyiMi='r'; boolean data tründeki bir variable'a da String, char veya int atayamazsiniz

        int sayiInt= 12;
        short sayiShort=20;
        byte sayiByte=21;
        double sayiDouble=14;
        //ayni veya bezer datalar iceren variable'larda ise kontrollü gecis mümkündür.

        sayiDouble = sayiInt; //b = k
        sayiInt = sayiShort; // b = k

        sayiByte= (byte)sayiInt; //k = b
        sayiShort = (short)sayiDouble; //k = b

        System.out.println(sayiByte);
        System.out.println(sayiShort);

    }
}