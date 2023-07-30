package day13_stringManipulationForLoop;

public class C02_replaceAll {

    public static void main(String[] args) {

        String str= "1Ja4va 8C9a2n5di1r.";

        str=str.replace("1", "");

        System.out.println(str);  //  Ja4va 8C9a2n5dir.

        // sayilarin tamamından kurtulmak istersek,
        // replace metodu yeterli olmaz.

        // Java da sayilar, ozel karekterler, alfebetik karekterlerin
        // replaceAll(istenenGrup, yeni değer)

        //regex : regularexpectetion

        //  Regex (Regular Expressions)
        //  \\s : space \\S : space olmayan hersey
        //  \\s+ : yanyana birden fazla space
        //  \\d : digits \\D : digit olmayan hersey
        //  \\w : harf veya rakam veya _ \\W : harf veya rakam veya _  olmayan hersey

        // orengin butun sayilarin yerine hiclik yazdırmak istersek

        str=str.replaceAll("\\d", "");

        System.out.println(str);

        str=str.replaceAll("\\w", "");

        System.out.println(str);




    }
}
