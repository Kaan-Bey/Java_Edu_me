package day14_forLoops;

import java.util.Scanner;

public class C04_2faktorielDuzgunKonsol {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen faktoriyelini almak istediğiniz sayıyı giriniz");
        int girilenSayi = scanner.nextInt();

        int faktoriyel = 1; //çarpımı etkilemeyecek 1 i atadık

        System.out.print(girilenSayi + "!="); // altta ki yazı devamına eklensin diye ln kaldırdık

        for (int i = girilenSayi; i >= 1; i--) {

            faktoriyel *=i; //faktoriyel döngüsünü yazdık

            if (i!=1){
                System.out.print(i + "*"); // yanyana yazdırsın diye ln i sildik.
            }else
                System.out.print(i);

        }
        System.out.print("= " + faktoriyel);
    }
}




