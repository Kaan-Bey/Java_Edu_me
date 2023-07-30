package day08IfElseStatement;

import java.util.Scanner;

public class C04_ifElseIfStatement {

    public static void main(String[] args) {

        /*


// Kullanicidan bir tam sayi isteyin
// Sayi 3' e bolunuyorsa 3'un kati
// sayi 5'e bolunuyorsa 5'in kati
// ikisine birden bolunuyorsa super sayi yazdirin

         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz :");
        int sayi = scanner.nextInt();

        if (sayi % 3 == 0 && sayi % 3 == 0) { System.out.println("Super sayi");
    } else if (sayi % 3 == 0) {
            System.out.println("Sayi 3'un kati");
        } else if (sayi % 5 == 0) {
            System.out.println("Sayi 5'in kati");
        }

    }
}
