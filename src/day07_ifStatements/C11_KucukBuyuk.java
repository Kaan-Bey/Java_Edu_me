package day07_ifStatements;

import java.util.Scanner;

public class C11_KucukBuyuk {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz :");
        char harf = scanner.nextLine().charAt(0);
        String harf1 = scanner.next(String.valueOf(harf));


        if (harf >= 'a' && harf <= 'z') {
            System.out.println(harf1.toUpperCase());
        } else {
            System.out.println(harf1);

        }


    }
}
