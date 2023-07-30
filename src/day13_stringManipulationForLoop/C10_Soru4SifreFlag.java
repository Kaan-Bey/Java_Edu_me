package day13_stringManipulationForLoop;

import java.util.Scanner;

public class C10_Soru4SifreFlag {

    public static void main(String[] args) {


        /*
            Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve kullaniciya
            duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa, "sifre
            basariyla kaydedildi" yazdirin
            - ilk harf kucuk harf olmali
            - son karakter rakam olmali
            - sifre bosluk icermemeli
            - uzunlugu en az 10 karakter olmali

         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz :");
        String sifre = scanner.next();

        char ilkHarf = sifre.charAt(0);
        char sonKrktr = sifre.charAt(sifre.length() - 1);


        if (!('a' <= ilkHarf && ilkHarf <= 'z')) {
            System.out.println("Ilk harf kucuk harf olmali");

        }
        if (!('0' <= sonKrktr && sonKrktr >= 10)) {
            System.out.println("son karakter rakam olmali");


        }
        if (sifre.length() <= 9) {
            System.out.println("uzunlugu en az 10 karakter olmali");

        }
        if (sifre.contains(" ")) {
            System.out.println("sifre bosluk icermemeli");
        }

            System.out.println("sifre basariyla kaydedildi");
        }

    }




