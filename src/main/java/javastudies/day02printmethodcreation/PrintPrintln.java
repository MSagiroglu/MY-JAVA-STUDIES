package javastudies.day02printmethodcreation;



public class PrintPrintln {

    public static void main(String[] args) {
        //"TECHPROEDUCATION" yazısını yukarıdan aşağıya harf harf yazdırınız.
        String str="TECHPRO EDUCATION";
        //1. WAY:

        /*
        \n ==> bir alt satira gecirir
        */
        System.out.println("***********1. YOL****************");
        System.out.println("T");
        System.out.println("E");
        System.out.println("C");
        System.out.println("H");
        System.out.println("P");
        System.out.println("R");
        System.out.println("O");
        System.out.println(" ");//"" HİÇLİKTE OLUR.
        System.out.println("E");
        System.out.println("D");
        System.out.println("U");
        System.out.println("C");
        System.out.println("A");
        System.out.println("T");
        System.out.println("I");
        System.out.println("O");
        System.out.println("N");
        //2. WAY:
        System.out.println("***********2. YOL****************");
        System.out.println("T\nE\nC\nH\nP\nR\nO\n\nE\nD\nU\nC\nA\nT\nI\nO\nN");

        //ÖRNEK-3
        // JAVAILEGUZELDUNYA ifadesinin her bir kelimesini alt satira
        // yazdiran kodu tek bir sout ile yazdiriniz

        System.out.println("***********ÖRNEK-3****************");
        System.out.println("JAVA\nILE\nGUZEL\nDUNYA");

        //ÖRNEK-4
        // JAVAILEGUZELDUNYA ifadesinin her bir kelimesini 1 tab boşluk bırakan
        // kodu yazdiriniz
        System.out.println("***********ÖRNEK-4****************");
        System.out.println("JAVA\tILE\tGUZEL\tDUNYA");

        //ÖRNEK-5
        // "Techpro " ile java cok ' kolay '
        // tek bir sout ile yazdiran kodu yaziniz
        System.out.println("***********ÖRNEK-5****************");
        System.out.println("Techpro ile java çok kolay");//Techpro ile java çok kolay
        System.out.println("\"Techpro \" ile java çok \' kolay \'");//"Techpro " ile java çok ' kolay '

        //ÖRNEK-6
        //" MAHARET" hic 'DUSMEMEK' degil;


        //  "Her dustugunde kalkabilmektir"

        //SEKLINDE NOKTALI VIRGULDEN SONRA
        // 3 SATIR ALTTAN paragraf basi yaparak yazdiran kodu olusturunuz
        System.out.println("***********ÖRNEK-6****************");
        System.out.println("\"MAHARET\" hiç 'DÜŞMEMEK' değil \n\n\n\t\"Herdüştüğünde kalkabilmektir\"");

        //ÖRNEK-7
        //Print ile Println arasındaki fark nedir?
        System.out.println("***********ÖRNEK-7****************");
        System.out.println("Hayat techpro ile çeok güzel");
        System.out.println("Ama nasıl baktığınıza bağlı");
        System.out.print("Yeterki siz isteyin");
        System.out.println("\nBahadır");


    }//main
}//class
