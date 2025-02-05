package day02_scanner_dataCasting;

import java.lang.System;

class C01_Variables {
    public static void main(String[] args) {

        int number; // declaration is done only once

        number = 15; // value assignment can be done as many times as needed
        System.out.println(number); // 15

        number = 20;
        System.out.println(number); // 20

        number = number + 10;

        /*
              20 + 10 => 30
         number = 30;
        */

        System.out.println(number); // 30

        String name = "Recep";
        System.out.println(name);

        name = "Bora";
        System.out.println("Your name: " + name);
        System.out.println("Number value: " + number);
    }
}
