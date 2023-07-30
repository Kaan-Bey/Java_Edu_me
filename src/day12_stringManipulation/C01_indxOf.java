package day12_stringManipulation;

public class C01_indxOf {

    public static void main(String[] args) {

        String str ="Ali topu at, topu at ali";

        System.out.println(str.indexOf("top"));

        System.out.println(str.indexOf("top", 4));

        System.out.println(str.indexOf("top", 5));

        System.out.println(str.indexOf("top", str.indexOf("top")+1));

        int ilkIndex = str.indexOf("at");

        if (ilkIndex==-1) {

            System.out.println("2 kere kullanilmamis");
        }else {

            int ikinciIndex = str.indexOf("at", str.indexOf("at")+1);
            if (ikinciIndex == -1) {

                System.out.println("1 kere kullanilmis");

            }else{

                System.out.println("2 kere veya daha fazla kullanilmistir.");
            }

        }

    }
}
