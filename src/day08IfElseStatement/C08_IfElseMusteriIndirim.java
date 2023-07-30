package day08IfElseStatement;

import java.util.Scanner;

public class C08_IfElseMusteriIndirim {

    public static void main(String[] args) {

        /*

        Kullanicidan aldigi urun adedi ve  liste fiyatini alin, kullaniciya musteri
karti olup olmadigini sorun. Musteri karti varsa 10 urunden fazla alirsa
%20, yoksa %15 indirim yapin, Musteri karti yoksa 10 urunden fazla
alirsa %15, yoksa %10 indirim yapin

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen aldiginiz urun adedini giriniz :");
        int adet = scanner.nextInt();

        System.out.println("Lutfen aldiginiz urunlerin liste fiyatini giriniz :");
        int fiyat = scanner.nextInt();


        System.out.println("Musteri kartininiz var mı? 1.Var, 2.Yok:");
        int kart = scanner.nextInt();

        if (adet >= 10 && kart == 1) {
            System.out.println("% 20 indirimli Toplam Ödeme=" + (fiyat - (fiyat * 0.2)));
        } else if (adet >= 10 && kart == 2) {
                System.out.println("% 15 indirimli Toplam Ödeme=" + (fiyat - (fiyat * 0.15)));
        } else if (adet < 10 && kart == 1) {
            System.out.println("% 15 indirimli Toplam Ödeme=" + (fiyat - (fiyat * 0.15)));
        } else if (adet < 10 && kart == 2) {
            System.out.println("% 10 indirimli Toplam Ödeme=" + (fiyat - (fiyat * 0.1)));

      /*
        if (adet>=10) {
        }else if (kart=true)
            System.out.println("% 20 indirimli Toplam Ödeme=" + (fiyat - (fiyat *(20/100)));
        }else )
                System.out.println("% 15 indirimli Toplam Ödeme=" + (fiyat - (fiyat *(15/100)));
            }
        }else if (adet<10){
                if (kart=true){
                    System.out.println("% 15 indirimli Toplam Ödeme=" + (fiyat - (fiyat *(15/100)));
                }else if (kart=false){
                      System.out.println("% 15 indirimli Toplam Ödeme=" + (fiyat - (fiyat *10/100));

       */

        }
    }
}




