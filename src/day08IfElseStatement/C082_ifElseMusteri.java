package day08IfElseStatement;

import java.util.Scanner;

public class C082_ifElseMusteri {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("nutella markete hoş geldiniz\nalmak istediğiniz nutella sayısını girin lütfen");
        int nutella=scanner.nextInt();
        double fiyat=nutella*60;
        System.out.println("nutella indirim kartınız varmı \n1.evet\n2.hayır");
        int kart= scanner.nextInt();
        if(kart==1){
            System.out.println("almak istediğiniz nutella fiyatı "+fiyat);
            double indirim = 0.10 * fiyat;
            double son = fiyat - indirim;
            System.out.println("son fiyat " + son);
            if(nutella>=20){
                System.out.println("ekstra 20 üstü indirimi");
                double indirim2=0.20 *son;
                double sonson=son-indirim2;
                System.out.println("son son fiyat " + sonson);
            }

        } else if (kart==2) {
            System.out.println("almak istediğiniz nutella fiyatı "+fiyat);
        }else {
            System.out.println("yanlış bir sayı girdiniz");
        }
    }
}


