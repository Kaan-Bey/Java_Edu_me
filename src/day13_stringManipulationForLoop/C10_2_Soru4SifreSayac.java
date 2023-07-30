package day13_stringManipulationForLoop;

import java.util.Scanner;

public class C10_2_Soru4SifreSayac {

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


        char sonKrktr = sifre.charAt(sifre.length() - 1);

        int sayac = 0;

        if (!(sifre.charAt(0) >= 'a' && sifre.charAt(0) <= 'z')) {
            System.out.println("İlk harf Küçük olmalı");
            sayac++;
        }
        if (!(sonKrktr >= '0' && sonKrktr <= '9')) {
            System.out.println("Son karakter rakam olmalı");
            sayac++;
        }
        if (sifre.contains(" ")) {
            System.out.println("Şifre boşluk içermemeli");
            sayac++;
        }
        if (!(sifre.length() >= 10)) {
            System.out.println("Uzunlugu en az 10 karakter olmalı");
            sayac++;
        }
        if (sayac == 0) {
            System.out.println("Şifre başarıyla kaydedildi!");
        }
    }
}

