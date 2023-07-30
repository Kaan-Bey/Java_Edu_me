package day09_NetedIfElseStatement_Ternary;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = scanner.nextInt();
        if (sayi % 2 == 0){
        System.out.println("Cift sayi");
    }else {
            System.out.println("Tek sayi");
        }

        System.out.println(sayi % 2 == 0 ? "Cift sayi" : "Tek sayi");
    }
}
