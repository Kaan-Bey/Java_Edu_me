package day13_stringManipulationForLoop;

import java.util.Scanner;

public class C07_Soru1CumleAl {

    public static void main(String[] args) {

        /*
        Soru 1 : Kullanicidan bir cumle alin
            - cumlede ev geciyorsa, "home home sweet home" yazdirin
            - cumlede is geciyorsa, "calismak guzeldir"
            - ikisini de iceriyorsa "Hem ev lazim hem is"
            - hicbirini icermiyorsa "cok calisman lazim" yazdirin

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz: ");
        String str = scanner.nextLine();

        if (str.contains("ev") && str.contains("is")) {
            System.out.println("hem ev lazim hem is");
        } else if (str.contains("ev")){
            System.out.println("home home sweet home");
        } else if (str.contains("is")){
            System.out.println("calismak guzeldir");

        } else {
            System.out.println("cok calisman lazim");
        }

    }
}