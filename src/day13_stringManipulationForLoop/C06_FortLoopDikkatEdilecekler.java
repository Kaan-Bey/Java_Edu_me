package day13_stringManipulationForLoop;

public class C06_FortLoopDikkatEdilecekler {

    public static void main(String[] args) {


        // verdigimiz baslangic degeri bitis sartini saglamazsa;

        for (int i = 0; i > 10; i++) {

            System.out.println(i);
        }

        // baslangic degeri ve degisim sekli, hic bir zaman bitis degerine ulasmazsa;
        // sonsuz loop olusur
        /*

        for (int i = 0; i>=0 ; i++){
        System.out.print(i+ " );

        */

        // kullanicinin verdigi baslangic ve bitis degerleri dahil olarak
        // bu sayilarin arasinda aranan sayiya tam bolunebilen bir sayi varsa,
        // aranan sayi ile tam bolune bilenbir sayi var. yazdirin.

        int baslangic = 201;
        int bitis = 237;

        int arananSayi = 43;

        for (int i = baslangic; i <=bitis ; i++) {
            System.out.println(i);
            if (i % arananSayi == 0){
                System.out.println("aranan sayi ile tam bolunen bir sayi var. ");
                break;
            }

        }

        /*

        bir loop devam ederken
        eger bir degerde istedigimiz islem gerceklesir
        ve loop'un geri kalanina ihtiyacimiz olmazsa
        orada break kullanabiliriz.

        java break; komutu gordugunde loop'u calistirmayi durdurur.
         */
    }
}
