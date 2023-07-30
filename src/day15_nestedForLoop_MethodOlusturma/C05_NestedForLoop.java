package day15_nestedForLoop_MethodOlusturma;

public class C05_NestedForLoop {

    public static void main(String[] args) {

        // dikdortgen seklinde satir ve sutun numaralarini yazdiralim

        int satir = 5;
        int sutun = 7;

        for (int i = 1; i <=satir; i++) {

            for (int j = 1; j <=sutun; j++) {

                System.out.print(i + "," + j + "   ");



            }
            System.out.println("");

            System.out.println("============================");

            // ucgen icinde satir ve sutun numaralarini yazdiralim

            for (int j = 1; j <= satir; j++) {

                for (int k = 1; k <=j ; k++) {
                    System.out.print(i + ","+ j + "  ");

                }
                System.out.println("");
            }
        }
    }
}
