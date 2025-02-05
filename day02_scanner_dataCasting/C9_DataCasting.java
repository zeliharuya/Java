package day02_scanner_dataCasting;

public class C9_DataCasting {
    public static void main(String[] args) {

        int intSayi=200;

        byte byteSayi = (byte)intSayi;
        System.out.println("intsayi : " + intSayi + "'yi byte'a cevirirsek degeri : " + byteSayi);//116
        /*
        1- eger kücük data türündeki datayi, büyük data türündeki variable'a atama yaparsak otomatik genisler
        2- eger büyül data türündeki datayi, küccük data rüründeki variable'a atama yaparsask,
        Java islemi otomatik yapmaz, bizden sorumlulugu ister
        data kaybi (ondalikli kismin gitmesi) veya dönüsüm olabilir.
         */
    }
}
