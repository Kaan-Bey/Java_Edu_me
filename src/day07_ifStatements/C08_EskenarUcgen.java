package day07_ifStatements;

import java.util.Scanner;

public class C08_EskenarUcgen {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz:");
        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();

        if (kenar1==kenar2 && kenar1==kenar3&&kenar1>0) {
            System.out.println("Eskenar ucgen");

        } else {
            System.out.println("Eskenar ucgen değil");

        }

    }
}
