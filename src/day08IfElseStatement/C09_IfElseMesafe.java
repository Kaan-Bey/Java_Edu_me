package day08IfElseStatement;

import java.util.Scanner;

public class C09_IfElseMesafe {

    public static void main(String[] args) {

        /*
        Kullanicidan mesafeyi kilometre olarak alin ve cevirmek istedigi birimi
sorun, istedigi birim metre veya santimetre ise cevirip yazdirin, yoksa
“istediginiz birim sisteme kayitli degil” yazdirin.

         */

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lutfen mesafeyi km olarak giriniz:");
        int mesafe = scanner.nextInt();
        System.out.println("Cevrilecek birim: 'm' veya 'cm'");
        int birim = scanner.nextInt();
        int m = mesafe/10;
        int cm = mesafe/100;


        System.out.println("Hangi birime cevirmek istersiniz: metre veya cm");

        if (birim==m) {
            System.out.println(mesafe / 10);
        }else if (birim==cm) {
            System.out.println(mesafe / 100);
        }else {
            System.out.println("istediginiz birim sisteme kayitli degil");

        }

    }
}
