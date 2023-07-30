package day03_scanner;

import java.util.Scanner;

public class C07_ScannerSwap1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen ilk sayiyi girinz :");

        int ilksayi = scanner.nextInt();

        System.out.println("Lutfen ikinci sayiyi girinz :");

        int ikincisayi = scanner.nextInt();

        int temp = ilksayi;

        ilksayi = ikincisayi;

        ikincisayi = temp;

        System.out.println("Yeni ilksayi : " + ikincisayi + "Yeni ikincisayi : " + ilksayi);


    }
}
