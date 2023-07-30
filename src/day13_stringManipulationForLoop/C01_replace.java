package day13_stringManipulationForLoop;

public class C01_replace {

    public static void main(String[] args) {

        String str = "Javayi anlayabiliyorum ama yazamiyorum.";

        // var olan bir String'in istedigimiz bolumunu degistirebiliriz.

        // String yerine char.squence'te gorebiliriz.

        System.out.println(str.replace('J', 'T'));

        System.out.println(str.replace('a', '*'));

        System.out.println(str.replace("ama yazamiyorum", "ve yazabiliyorum"));

        System.out.println(str.replace("Java", "AA"));




    }
}
