package javastudies.day03scanner;

import java.util.Scanner;

public class Scanner02 {
    //Kullanıcının isim ve soy ismini alıp ikisini aynı satırda ekrana yazdırınız.
    public static void main(String[] args) {
        //1.adım: Scanner Class'tan object oluştur.
        Scanner input=new Scanner(System.in);

        //2.adım: Kullanıcıya ne istediğinize dair mesaj veriniz.
        System.out.println("İlk isminizi giriniz : ");
        String firstName = input.next();

        //3.adım: Kullanıcıya ne istediğinize dair 2.mesajı veriniz.
        System.out.println("Soy isminizi giriniz : ");
        String lastName= input.next();

        //4.adım: Kullanıcıya ait firstName ve lastName'i tek satırda yazdır.
        System.out.println(firstName+" "+lastName);

    }
}
