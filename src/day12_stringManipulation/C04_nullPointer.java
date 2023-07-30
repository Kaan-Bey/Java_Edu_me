package day12_stringManipulation;

public class C04_nullPointer {

    public static void main(String[] args) {

        String str1;



        str1="Java";

        System.out.println(str1);
        System.out.println(str1.concat("candir"));

        String str2 = null;

        System.out.println(str2);

        System.out.println(str2+ "candir");

        System.out.println(str2.concat("candir"));

    }


}
