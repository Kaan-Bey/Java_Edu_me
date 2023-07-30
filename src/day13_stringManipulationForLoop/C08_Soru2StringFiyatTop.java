package day13_stringManipulationForLoop;

import java.util.Scanner;

public class C08_Soru2StringFiyatTop {

    public static void main(String[] args) {

        /*

        Soru 2 : Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
            input1 : “15.30 €” , input2 : “11.40 €”
            output : 26.70 €
         */
/*


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen fiyatlari giriniz: ");

        //double db1= scanner.nextDouble();
        //double db2= scanner.nextDouble();

        String fiyat1 = scanner.nextLine();
        String fiyat2 = scanner.nextLine();


               System.out.println((Integer.parseInt(fiyat1) + Integer.parseInt(fiyat2)+" €"));

*/
        Scanner scanner =new Scanner(System.in);
        System.out.println("Ilk ürün fiyatlarini giriniz: ");
        String urunFiyati = scanner.next();
        System.out.println("Ikinci ürün fiyatini giriniz: ");
        String urunFiyati2 = scanner.next();

        System.out.println("girdiginiz urunlerin toplam fiyati: "
                + (Integer.parseInt(urunFiyati)+Integer.parseInt(urunFiyati2)));
    }

}

