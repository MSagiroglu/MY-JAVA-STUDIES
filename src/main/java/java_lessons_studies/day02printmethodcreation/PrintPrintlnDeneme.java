package java_lessons_studies.day02printmethodcreation;

public class PrintPrintlnDeneme {
    //ÖRNEK-1
    //"TECHPROEDUCATION" yazısını yukarıdan aşağıya harf harf yazdırınız.
    public static void main(String[] args) {
        System.out.println("----------ÖRNEK-1----------");
        System.out.println("TECHPROEDUCATION");
        //1. way
        System.out.println("----------1. way----------");
        System.out.println("T");
        System.out.println("E");
        System.out.println("C");
        System.out.println("H");
        System.out.println("P");
        System.out.println("R");
        System.out.println("O");
        System.out.println("");// " " 'da yapılabilirdi.
        System.out.println("E");
        System.out.println("D");
        System.out.println("U");
        System.out.println("C");
        System.out.println("A");
        System.out.println("T");
        System.out.println("I");
        System.out.println("O");
        System.out.println("N");

        //2. way
        System.out.println("----------2. way----------");
        System.out.println("T\nE\nC\nH\nP\nR\nO\n\nE\nD\nU\nC\nA\nT\nI\nO\nN");

        //ÖRNEK-2
        // JAVAILEGUZELDUNYA ifadesinin her bir kelimesini alt satira
        // yazdiran kodu tek bir sout ile yazdiriniz
        System.out.println("----------ÖRNEK-2----------");
        System.out.println("JAVAILEGUZELDUNYA");
        System.out.println("JAVA\nILE\nGUZEL\nDUNYA");

        //ÖRNEK-3
        // JAVAILEGUZELDUNYA ifadesinin her bir kelimesini 1 tab boşluk bırakan
        // kodu yazdiriniz

        System.out.println("----------ÖRNEK-3----------");
        System.out.println("JAVAILEGUZELDUNYA");
        System.out.println("JAVA\tILE\tGUZEL\tDUNYA");

        //ÖRNEK-4
        // "Techpro " ile java cok ' kolay '
        // tek bir sout ile yazdiran kodu yaziniz
        System.out.println("----------ÖRNEK-4----------");
        System.out.println("\"Techpro \" ile java cok \' kolay \'");// \' e gerek yok aslında

        //ÖRNEK-5
        //" MAHARET" hic 'DUSMEMEK' degil;


        //  "Her dustugunde kalkabilmektir"

        //SEKLINDE NOKTALI VIRGULDEN SONRA
        // 3 SATIR ALTTAN paragraf basi yaparak yazdiran kodu olusturunuz
        System.out.println("----------ÖRNEK-5----------");
        System.out.println("\"MAHARET\" hic 'DUSMEMEK' degil\n\n\n\t\"Her dustugunde kalkabilmektir\"");
        //veya
        System.out.println("----------ÖRNEK-5----------");
        System.out.println("\" MAHARET\" hic 'DUSMEMEK' degil\n"+"\n"+"\n"+"\t"+"\"Her dustugunde kalkabilmektir\"");


    }
}
