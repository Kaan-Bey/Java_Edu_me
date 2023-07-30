package day09_NetedIfElseStatement_Ternary;

import java.util.Scanner;

public class C01_EmeklilikIkıncıCozum {

    public static void main(String[] args) {


/*
        Kullanicidan cinsiyetini ve yasini alin,
                Kadin, 60 yas ve uzeri ,
                Erkek 65 yas ve uzeri emekli olabilir.
                Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin” veya
    “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

 */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz E : Erkek , K : Kadin");
        char cinsiyet = scanner.next().charAt(0);

        System.out.println("Lutfen yasinizi giriniz :");
        double yas = scanner.nextDouble();

        if (yas < 10 || yas > 80) {
            System.out.println("Gecersiz Yas");
        } else if (yas < 60) {
            if (cinsiyet == 'K') {
                System.out.println("Kadin emeklioabilmek icin " + (60 - yas) + "yil daha calismalisiniz ");
            } else if (cinsiyet == 'E') {
                System.out.println("Erkek emeklioabilmek icin " + (65 - yas) + "yil daha calismalisiniz ");
            } else
                System.out.println("Cinsiyet hatali");


        } else if (yas < 65) {
            if (cinsiyet == 'K') {
                System.out.println("Kadin emekli olabilir.");
            } else if (cinsiyet == 'E') {
                System.out.println("Erkek emeklioabilmek icin " + (65 - yas) + "yil daha calismalisiniz ");
            } else {
                System.out.println("Cinsiyet hatali");
            }

        } else {
            if (cinsiyet == 'K' || cinsiyet == 'E') {
                System.out.println("Emekli olabilir ");

            } else {
                System.out.println("Cinsiyet hatali");
            }
        }
    }
}








