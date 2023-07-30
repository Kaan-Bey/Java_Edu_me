package day15_nestedForLoop_MethodOlusturma;

import java.util.Scanner;

public class C04_yildizYazdirmaSorusu {

    public static void main(String[] args) {

        /*

        Soru – Asagidaki sekilleri yazdirin
        *           * * * * * * * *             * * * * * * * *
        * *         * * * * * * * *             * * * * * *
        * * *       * * * * * * * *             * * * *
        * * * *     * * * * * * * *             * *

         */


        Scanner scanner =new Scanner(System.in);
        System.out.println("Lutfen satir sayisini giriniz :");
        int satir =scanner.nextInt();


        for (int i = 1; i <= satir; i++) {  // satir

            for (int j = 1; j <= i; j++) {  // sutun
                System.out.print("*  ");



            }
            System.out.println("");

        }

    }
}
