package day03_scanner;

import java.util.Scanner;

public class C03_Scanner_ikiSayininToplamiCarpimi {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir double sayi giriniz :");

        double girilenDouble = scanner.nextDouble();


        System.out.println("Lutfen bir tam sayi giriniz :");

        int girilenint = scanner.nextInt();


        System.out.println("Iki sayinin toplamı : " + (girilenDouble+girilenint));
        System.out.println("Iki sayinin carpimi : " + girilenDouble*girilenint);
    }
}
