package day07_ifStatements;

import java.util.Scanner;

public class C06_BagimsizIfCumlecikleri {

    public static void main(String[] args) {

        Scanner scaneer = new Scanner(System.in);
        System.out.println("lütfen pozitif bir tamsayi giriniz");
        int girilenSayi = scaneer.nextInt();

        if (girilenSayi % 3 == 0 || girilenSayi % 5 == 0 ) System.out.println("Guzel sayi");


    }



}
