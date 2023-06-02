package javaders.day03methodcreationscanner;

import java.util.Scanner;

public class C01_KullanicidanDataAlma {
    public static void main(String[] args) {
        //ÖRNEK-1:

        //Kullanicidan aldiginiz
        // character ile asagidaki gibi bir gorunum olusturunuz
        /*
          A
         A A
        A A A
        */

        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen Büyük Harfli Bir Karakter Yazınız : ");
        char ch=input.next().charAt(0);
        //Sadece char data type'i icin nextChar() diye bir method olmadigi icin kullanicidan
        //alip ch konteynir'ina yerlestimek icin cagariyoruz
        //next().charAt(0);methodunu kullaniriz
        System.out.println("  "+ch+"  "+"\n"+" "+ch+" "+ch+"\n"+ch+" "+ch+" "+ch);
        //VEYA
        System.out.println("  "+ch);
        System.out.println(" "+ch+" "+ch);
        System.out.println(ch+" "+ch+" "+ch);

        //boşlukları tab tuşu ile oluşturarak yapalım.
        System.out.println("\t\t"+ch+"\t\t"+"\n\t"+ch+"\t\t"+ch+"\t\n"+ch+"\t\t"+ch+"\t\t"+ch);

        StringBuffer a = new StringBuffer("MUSTAFA");//String'i ters çevirme!!!
        System.out.println(a.reverse());


    }//main
}//class
