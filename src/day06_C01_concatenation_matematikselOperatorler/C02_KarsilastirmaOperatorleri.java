package day06_C01_concatenation_matematikselOperatorler;

public class C02_KarsilastirmaOperatorleri {

    public static void main(String[] args) {

        int a = 10;

        int b = 20;

        // Java'da tek esittir isareti karsilastirma degil, atama isaretidir. assigment

        b = 2 * a;

        // Java'da esitligi kontrol etmek istersek; == kullniriz.

        System.out.println( b == 2 * a);  //20 == 20  ==>  true

        System.out.println( 3*b > 5*a);   // 60 > %0 ==> true

        System.out.println( b >= b-a);    //  20 >= 10  ==> true

        System.out.println();




    }
}
