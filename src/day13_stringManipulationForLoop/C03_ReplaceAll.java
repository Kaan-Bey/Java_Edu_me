package day13_stringManipulationForLoop;

import java.util.Scanner;

public class C03_ReplaceAll {

    public static void main(String[] args) {

        /*

        Kullanicidan alinan metindeki  tum sayilari ve space disindaki ozel karekterleri temizleyin.
        metnin sonuna da nokta koyun.

        istenmeyen rakam ve ozel karakterleri silip,
                sadece ilk harfi buyuk diger harfler kucuk harf yapan bir program yazin.
                J1*2av4.a C67//an=+dir--
                input : java1 ogRe2@nMek3 #ne +Gu=zel
                output : Java ogrenmek ne guzel.

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen istediginiz mesaji girin :");
        String metin = scanner.nextLine();

        //once sayilardan kurtulalim

        metin = metin.replaceAll("\\d", "");

        // ozel karekterlerden kurtulmak istedimizde,
        // once boslugu korumaya alalim.
        // ortak metnimizde artik sayi yok, onun icin space yerine herhangi bir sayi atayalim.
        metin = metin.replaceAll("\\s", "1");


        //ozel karekterlerden kurtulalim

        metin = metin.replaceAll("\\W", "");


        metin = metin.replaceAll("1", " ");

        metin = metin +".";


        System.out.println(metin);




    }

}
