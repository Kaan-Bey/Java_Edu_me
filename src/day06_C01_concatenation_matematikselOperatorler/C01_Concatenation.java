package day06_C01_concatenation_matematikselOperatorler;

public class C01_Concatenation {

    public static void main(String[] args) {

    String s1 = "Java";
    String s2 = "Candır";
    String s3 = " ";
    String s4 = "";
    int a = 3;
    int b = 5;

        System.out.println(s1+a+b);
        System.out.println(s1+a*b);
        System.out.println(a+b+s2);
        System.out.println(s4+b+a+s1);
        System.out.println(b+(a+s1));
        System.out.println(b+s4+a+s1);
        System.out.println(s4+a+b+s3+s1);

        System.out.println(a<b);  // true
        System.out.println( ! (a<b));  // false
        System.out.println(a != b);    // true


    }
}
