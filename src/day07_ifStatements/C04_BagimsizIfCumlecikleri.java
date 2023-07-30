package day07_ifStatements;

import java.util.Scanner;

public class C04_BagimsizIfCumlecikleri {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz:");
        int girilenSayi = scanner.nextInt();

        if (girilenSayi % 3 == 0) {
        System.out.println("3 ile bolunebilen tam sayi");

    }

        if (girilenSayi % 5 == 0){
            System.out.println("5 ile bolunebilen tam sayi");
        }


}
}
