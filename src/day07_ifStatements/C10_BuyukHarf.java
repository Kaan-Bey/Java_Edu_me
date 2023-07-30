package day07_ifStatements;

import java.util.Scanner;

public class C10_BuyukHarf {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir karekter giriniz :");
        char harf = scanner.nextLine().charAt(0);

        if (harf>='A' && harf <='Z') {
            System.out.println("Girilen " + harf + " harfi buyuk harf'tir.");
        } else {
            System.out.println("Girilen " + harf + " harfi kucuk harf'tir.");
        }



    }
}
