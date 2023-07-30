package day13_stringManipulationForLoop;

import java.util.Scanner;

public class C13_Soru2_FarkliCozum {

    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("Ilk ürün fiyatlarini giriniz: ");
        String urunFiyati = scanner.next();
        System.out.println("Ikinci ürün fiyatini giriniz: ");
        String urunFiyati2 = scanner.next();

        System.out.println("girdiginiz urunlerin toplam fiyati: "
                + (Integer.parseInt(urunFiyati)+Integer.parseInt(urunFiyati2)));
    }
}
