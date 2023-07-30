package day08IfElseStatement;

import java.util.Scanner;

public class C03_ifStatementAABBCC {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz :");
        int not = scanner.nextInt();

        if (not >=85)  {
            System.out.println("AA ile gectiniz");
        } else if (not >=65)  {
            System.out.println("BB ile gectiniz");
        } else {
            if (not >= 50) {
                System.out.println("CC ile gectiniz");

            } else {
                System.out.println("Maalesef kaldiniz");

            }
        }
    }
}
