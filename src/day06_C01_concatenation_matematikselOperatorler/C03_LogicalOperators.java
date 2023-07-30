package day06_C01_concatenation_matematikselOperatorler;

import java.util.Scanner;

public class C03_LogicalOperators {

    public static void main(String[] args) {

        /*
        && operatoru mukemmelliyetcidir.



         */


        System.out.println( 5 > 3 && 6 > 4);  // true and true ==> true

        System.out.println( 5 < 3 && 6> 4);  // false and true ==> false

        System.out.println( 5 > 3 && 6 <= 4 );   // true and false ==> false

        System.out.println( 5 <= 3 && 6 <= 4 );   // false and false ==> false

        int sayi = 24;

        System.out.println(sayi % 2 == 0 && sayi % 3 == 0 && sayi % 5 == 0);


        System.out.println( sayi >= 0 && sayi <= 100);


    }
}
