package day08IfElseStatement;

import java.util.Scanner;

public class C05_BoyKitleEndeki {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen boyunuzu cm olarak giriniz :");
        double boy = scanner.nextDouble();

        System.out.println("Lutfen kilonuzu kg olarak giriniz :");
        double kilo = scanner.nextDouble();

        double endeks = (kilo * 10000) / (boy * boy);

        if (endeks >= 25 && endeks <= 35) {
            System.out.println("obez");
        } else {
            if (endeks >= 20 && endeks <= 25) {
                System.out.println("normal");
            } else {

                    System.out.println("zayif");


            }

        }
    }
}