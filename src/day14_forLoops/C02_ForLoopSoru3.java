package day14_forLoops;

import java.util.Scanner;

public class C02_ForLoopSoru3 {

    public static void main(String[] args) {

        /*

               Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
               sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
                Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin


         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Baslangic degeri icin pozitif bir tam sayi giriniz :");
        int baslangic = scanner.nextInt();
        System.out.println("Lütfen Bitis degeri icin pozitif bir tam sayi giriniz :\" :");
        int bitis = scanner.nextInt();
        int toplam = 0;



        if (baslangic<bitis){

        for (int i = baslangic; i <= bitis; i++) {
            toplam += i;

            }

            System.out.println("Girilen araliktaki sayilarin toplamı : " + toplam);

        } else {
            System.out.println("Baslangic degeri, bitis degerinden kucuk olamli.");
        }

    }
}
