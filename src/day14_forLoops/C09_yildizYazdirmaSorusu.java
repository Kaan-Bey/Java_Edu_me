package day14_forLoops;

public class C09_yildizYazdirmaSorusu {

    public static void main(String[] args) {

        /*

        Soru – Asagidaki sekilleri yazdirin
        *           * * * * * * * *             * * * * * * * *
        * *         * * * * * * * *             * * * * * *
        * * *       * * * * * * * *             * * * *
        * * * *     * * * * * * * *             * *

         */

        String str = "*";

        for (int i = 1; i <= 4; i++) {
            System.out.print(str+" ");
            System.out.print("");
            for (int j = 1; j <= 3; j++) {
                System.out.println(str+" ");



            }

        }

    }
}
