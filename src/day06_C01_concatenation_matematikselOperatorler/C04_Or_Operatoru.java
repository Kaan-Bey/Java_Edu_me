package day06_C01_concatenation_matematikselOperatorler;

public class C04_Or_Operatoru {

    public static void main(String[] args) {

        /*

        Or operatoru iyimsendir.
        Yani tek bir true bile yeterli olur.
        or operatorunde tum mantiksal ifadeler false ise sonuc false degilse true'dur.

        or operatoru matematikteki toplama islemine benzer.
        toplanan sayilarda bir tane bile 0 olmayan varsa, sonuc sifir olmaz.

        0+0+0+0+0 ==> 0
        2+0+0+0+0  != 0

        or isareti klavyede altgr + < isareti




         */

        System.out.println( 3 > 5 || 6 > 4 );
        System.out.println( 3 < 5 || 6 > 4 );
        System.out.println( 3 < 5 || 6 < 4 );
        System.out.println( 3 > 5 || 6 < 4 );

        int sayi = 24;

        System.out.println(sayi % 3 ==0 || sayi % 5 == 0);

        System.out.println( sayi > 0 || sayi < 100);

        


    }
}
