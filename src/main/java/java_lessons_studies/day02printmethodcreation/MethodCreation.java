package java_lessons_studies.day02printmethodcreation;

public class MethodCreation {
    public static void main(String[] args) {

        //static ==> protokol tribünü vip class
        //ÖRNEK - 1:
        //karenin alanını veren kodu yazınız.

        //ÖRNEK - 1: methodları 1:
        kareAlan(7);

        //ÖRNEK - 1: methodları 2:
        System.out.println("kare2Alan(5) = " + kare2Alan(5));
         /*
        return type void oldugunda dondurdugu her hangi bir deger olmadigi icin
        sadece ekranda bastirdigi icin; ekleme cikarma ya da method kullanma vs.
        hic bir islem yapamayiz.
        Method sonucunda ortaya cikan datayi kullanamayiz. Sadece ekranda goruruz.
        TV ekraninda elmalari gorup elmali pasta yapamamiz gibi...
        */
        //ÖRNEK - 2:
        //Dikdörtgenin alanını veren kodu yazınız.

        //ÖRNEK - 2: methodları 1:
        System.out.println("dikdortgenAlan(4,5) = " + firstDikdortgenAlan(4, 5));

        //ÖRNEK - 2: methodları 2:
        secondDikdortgenAlan(4,5);
        /*
        return type'i int oldugu icin bir deger dondurur.Ve bu degeri biz kullanabiliriz.
        Method kullanabiliriz.
        Ekleme cikarma carpma bolme istedigimiz gibi elde edilen datayi kullanabiliriz
        */
    }//main
    //ÖRNEK - 1: methodları 1:
    public static void kareAlan (int kareKenar){
        System.out.println("Karenin alanı : "+kareKenar*kareKenar);
    }
    //ÖRNEK - 1: methodları 2:
    public static int kare2Alan(int a){
        return a*a;
    }
    //ÖRNEK - 2: methodları 1:
    public static int firstDikdortgenAlan(int kisaKenar, int uzunKenar){
        return kisaKenar*uzunKenar;
    }
    //ÖRNEK - 2: methodları 2:
    public static void secondDikdortgenAlan(int kısKen, int uzunKen){
        System.out.println("2.Dikdörtgenin Alanı : " +kısKen*uzunKen);}
}//class
