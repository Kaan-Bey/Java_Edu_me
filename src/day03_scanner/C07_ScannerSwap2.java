package day03_scanner;

import java.util.Scanner;

public class C07_ScannerSwap2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen ilk sayiyi girinz :");

        int ilksayi = scanner.nextInt();

        System.out.println("Lutfen ikinci sayiyi girinz :");

        int ikincisayi = scanner.nextInt();

        ilksayi =  ilksayi+ikincisayi-ilksayi;
        ikincisayi = ilksayi+ikincisayi-ikincisayi;

        System.out.println("Yeni ilksayi : " + ilksayi + "Yeni ikincisayi : " + ikincisayi);



    }
}
