package day09_NetedIfElseStatement_Ternary;

import java.util.Scanner;

public class C07_Ternary {

    public static void main(String[] args) {

        /*

        Soru 6- Kullanicidan bir sayi alin ve mutlak derring yazdirin
         */

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz:");

        int sayi = scanner.nextInt();

        System.out.println(sayi>0 ? sayi : (-1*sayi));
    }
}
