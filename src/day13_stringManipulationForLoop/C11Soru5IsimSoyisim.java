package day13_stringManipulationForLoop;

import java.util.Scanner;

public class C11Soru5IsimSoyisim {

    public static void main(String[] args) {

        /*
        Soru 5 : Kullanicidan isim ve soyismini ayri ayri alin.
            - ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde
            yazdirin
            - soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk
            harflerle yazdirin.

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz: ");

        String isim = scanner.nextLine();
        System.out.println("Lutfen soyisminizi giriniz: ");
        String soyIsim=scanner.nextLine();




        if (isim.length()>soyIsim.length()){
            System.out.println(isim.toUpperCase().substring(0,1) + isim.toLowerCase().substring(1)+" "+
                    soyIsim.toUpperCase().substring(0,1) + soyIsim.toLowerCase().substring(1));
        } else {
            System.out.println(isim.toUpperCase().substring(0,1)+ isim.toLowerCase().substring(1)+
                    " " + soyIsim.toUpperCase());
        }

    }
}