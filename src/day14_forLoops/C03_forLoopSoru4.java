package day14_forLoops;

import java.util.Scanner;

public class C03_forLoopSoru4 {

    public static void main(String[] args) {


        //Soru 4- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        //        sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        //        Bitis degeri baslangic degerinden kucuk olsa da program calissin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Baslangic degeri icin pozitif bir tam sayi giriniz :");
        int baslangic = scanner.nextInt();
        System.out.println("Lütfen Bitis degeri icin pozitif bir tam sayi giriniz :");
        int bitis = scanner.nextInt();
        int toplam = 0;


        if (baslangic < bitis) {

            for (int i = baslangic; i <= bitis; i++) {
                toplam += i;

            }

            System.out.println("Girilen araliktaki sayilarin toplamı : " + toplam);

        } else {

            for (int i = bitis; i <= baslangic; i++) {
                toplam += i;

            }

            System.out.println("Girilen araliktaki sayilarin toplamı : " + toplam);
        }

    }
}
