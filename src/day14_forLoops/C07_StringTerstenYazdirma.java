package day14_forLoops;

import java.util.Scanner;

public class C07_StringTerstenYazdirma {

    public static void main(String[] args) {


        /*
        Soru 9 (interview)- Kullanicidan bir String isteyin ve String’i tersten yazdirin.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen tersten yazdirmak istediginiz metni giriniz :");

        String str = scanner.nextLine();


        for (int i = str.length()-1; i >=0 ; i--) {

            System.out.print(str.charAt(i));
        }

        System.out.println("");

        // terse cevrilen metni kaydedelim

        String tersMetin = "";

        for (int i = str.length()-1; i >= 0 ; i--) {
            tersMetin += str.charAt(i);

        }

        System.out.println("Tersine cevrilen metin : " + tersMetin);
        }

    }

