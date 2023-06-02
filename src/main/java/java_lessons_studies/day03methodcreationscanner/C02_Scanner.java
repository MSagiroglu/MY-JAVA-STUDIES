package javaders.day03methodcreationscanner;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {
        /*Kullanıcıdan data almak için  "Scanner"
        classından scan/input/scanner objesi oluşturunuz.
        Bu şekilde kullanıcıyı yönlendirerek gerekli dataları elde ederiz.
         */

        //1. adım: Obje oluşturma;

        Scanner input= new Scanner(System.in);//Nur Hanım==>input objesi

        //2. adım: Kullanıcıya ne yapacağını sorunuz

        System.out.println("Lütfen cinsiyetinizi giriniz K/E şeklinde :");

        //3. adım: Kullanıcıdan alınan data yapısına büyüklüğüne göre
        // uygun bir variable'in içine yerleştirilir.

        char cinsiyet=input.next().charAt(0);

        //4. adım: Ekranda görebilmek için ve kullanıcının da verdiği
        // bilgileri teyit edebilmesi için yazdırıyoruz.

        System.out.println("cinsiyet = " + cinsiyet);

        //ÖRNEK -2 : Kullanıcıya cinsiyetini , adını ,memleketini,
        // yaşını, boyunu ülkesini sevip sevmediğini,maaşını soran bir program yazınız.

        Scanner input2= new Scanner(System.in);//Gönül Hanım==>input2 objesi
        System.out.println("Lütfen cinsiyetinizi giriniz Kadın ise K Erkek ise E harfi giriniz...");
        char gender=input2.next().charAt(0);

        System.out.println("Lütfen adınızı ve soyadınızı giriniz...");
        String adiSoyadi=input2.next();//Tüm kelimeleri alır : Çift isimli insanlar için.


        System.out.println("Lütfen yaşınızı giriniz :");
        byte age=input2.nextByte();

        System.out.println("Lütfen nereli olduğunuzu giriniz :");
        String city=input2.next();

        System.out.println("Lütfen boyunuzu giriniz");
        double boy=input2.nextDouble();

        System.out.println("Lütfen ülkenizi sevip sevmediğinizi yazınız True/False olarak");
        boolean seviyorMu=input2.nextBoolean();

        System.out.println("Lütfen maaşınızı giriniz :");
        long maas=input2.nextLong();

        System.out.println("*************** Gönül Hanım *****************");

        System.out.println("adiSoyadi = " + adiSoyadi+"\ncinsiyet :"+gender+"\nmemleket :"+city+"\nyaş :"+age+
                "\nboy :"+boy+"\nülenisini seviyormu ? :"+seviyorMu+"\nmaaşınız :"+maas);


    }
}
