package javastudies.day03scanner;

import java.util.Scanner;

public class Scanner03 {
    //Kullanıcıda adresini al ve ekrana yazdırınız.
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen Adresinizi Giriniz");
        //next() methodu kullanıcıdan tek kelimeli Stringi almak için kullanılır.
        //nextLine() methodu kullanıcıdan çok kelimeli Stringi almak için kullanılır.

        String addres=input.nextLine();
        System.out.println(addres);


    }
}
