package day15_nestedForLoop_MethodOlusturma;

public class C01_NestedForLoop {

    public static void main(String[] args) {

        /*
        asagidaki tabloyu yazdiriniz

        1 2 3 4
        2 4 6 8
        3 6 9 12
         */
        for (int i = 1; i <= 4 ; i++) {
            System.out.print(i*1 + " ");

        }
        System.out.println("");

        for (int i = 1; i <= 4 ; i++) {
            System.out.print(i*2 + " ");

        }
        System.out.println("");


        for (int i = 1; i <=4 ; i++) {
            System.out.print(i*3 + " ");

        }

        System.out.println("==================");

        for (int i = 1; i <=3 ; i++) {

        }
    }
}
