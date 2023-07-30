package day15_nestedForLoop_MethodOlusturma;

public class C06_KendiSubStringimiz {

    public static void main(String[] args) {

        String str = "Java Candir";
        int baslangic = 3;
        int bitis = 7;

        /*
        Verilen String ve baslangic, bitis degerlerini dikkate alarak

        1- bitis degeri, baslangic degerinden kucukse hata mesaji yazdirin
        2- baslangic veya bitis degerleri index degerleri ile uyusmuyorsa hata mesaji
        3- degerler uygunsa baslangic indexinden (dahil), bitis index'ine (haric) kadar karekterleri yazdirin.



         */

        if (baslangic > bitis) {

            System.out.println("baslangic degeri, bitis degerinden buyuk olmali");

        } else if (baslangic < 0 || bitis < 0 || baslangic >= str.length() || bitis >= str.length()) {
            System.out.println("index hatali");
        } else {

            for (int i = baslangic; i < bitis; i++) {
                System.out.print(str.charAt(i));
            }
        }
        System.out.println("");
        System.out.println("===========");

        str.substring(5);

        /*

        Bu metod bize "Candir" dondurur.
        ancak yazdirmaz isek veya bir variable'a atamaz isek
        bu metod'un dondurdugu sonuc anlamsiz olur.
         */
        String istenenStrBolumu = str.substring(5);  // kaydeder ama yazdirmaz

        System.out.println("===========");

        System.out.println(str.substring(5));       // yazar ama kaydetmez
    }
}

