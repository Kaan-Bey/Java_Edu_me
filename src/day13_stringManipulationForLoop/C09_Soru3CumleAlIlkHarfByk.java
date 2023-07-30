package day13_stringManipulationForLoop;

import java.util.Scanner;

public class C09_Soru3CumleAlIlkHarfByk {

    public static void main(String[] args) {

        /*
        Soru 3 : Kullanicidan alinan metindeki istenmeyen rakam ve ozel karakterleri silip,
            sadece ilk harfi buyuk diger harfler kucuk harf yapan bir program yazin.
            input : java1 ogRe2@nMek3 #ne +Gu=zel
            output : Java ogrenmek ne guzel.

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz: ");
        String str = scanner.nextLine();

            str = str.replaceAll("\\d", "");
            System.out.println(str);

            str = str.replaceAll("\\s", "1");
        System.out.println(str);

            str = str.replaceAll("\\W", "");
        System.out.println(str);
        str=str.replaceAll("\\d", " ");



            System.out.print (str);


    }
}