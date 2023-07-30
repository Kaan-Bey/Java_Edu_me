package day14_forLoops;

import java.util.Scanner;

public class C01_soru4Sifre {

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

        boolean flag = true;


        if (!('a' <= ilkHarf && ilkHarf <= 'z')) {
            System.out.println("Ilk harf kucuk harf olmali");
            flag = false;

        }
        if (!('0' <= sonKrktr && sonKrktr <= '9')) {
            System.out.println("son karakter rakam olmali");
            flag = false;


        }
        if (!(sifre.length() >= 10)) {
            System.out.println("uzunlugu en az 10 karakter olmali");
            flag = false;

        }
        if (sifre.contains(" ")) {
            System.out.println("sifre bosluk icermemeli");
            flag = false;
        }

        if (flag==true)

        System.out.println("sifre basariyla kaydedildi");
    }

}





