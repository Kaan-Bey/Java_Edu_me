package day13_stringManipulationForLoop;

public class C04_replaceFirst {

    public static void main(String[] args) {


        String str = "Java Candir, kendisini cok seviyoruz123";

        // sadece ilk a'yi ' BUYUK A yapalim.

        System.out.println(str = str.replaceFirst("a", "A"));


        // ilk space'i iki space haline getirin

        System.out.println(str.replaceFirst(" ", "  "));

        // ilk sayiyi, space haline getirin.

        System.out.println(str.replaceFirst("\\d", " "));

        // ilk ozel karekteri, * haline getirin.

        System.out.println(str.replaceFirst("\\W", "*"));




    }
}
