package day08IfElseStatement;

import java.util.Scanner;

public class C01_IfStatementBuyukHarfOdev {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir karekter giriniz :");
        char girilenKarekter = scanner.next().charAt(0);

        if (girilenKarekter >= 'A' && girilenKarekter <= 'Z'){
            System.out.println("Girilen karekter buyuk harf.");

            } else {
            System.out.println("Girilen karekter kucuk harf.");
        }



    }
}
