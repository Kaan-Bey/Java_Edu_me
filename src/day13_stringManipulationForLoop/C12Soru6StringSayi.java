package day13_stringManipulationForLoop;

import java.util.Scanner;

public class C12Soru6StringSayi {

    public static void main(String[] args) {

        /*
       Soru 6 : Kullanicidan alinan bir String alin, String’in uzunlugu cift sayi ise tam ortasina
                :) ekleyin, String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :(
                yazdirin.

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir yazi giriniz: ");
        String str = scanner.nextLine();
        int ortakrktr = str.length()/2;


        System.out.println(str.length());


        if (str.length()%2==0){
            System.out.println(str.substring(0, ortakrktr) + ":)" + str.substring(ortakrktr));
        }else{
            System.out.println(str.substring(0, ortakrktr) + ":(" + str.substring(ortakrktr+1));
        }

    }
}