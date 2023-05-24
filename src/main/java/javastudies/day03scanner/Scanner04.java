package introductions.day03scanner;

import java.util.Scanner;

public class Scanner04 {
    //Kullanıcıdan 2 sayı alıp dört işlem yapan ve işlemlerin
    // sonuçlarını yazdıran kodu yazınız.Hesap Makinesi Oluşturmak:
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen iki sayı giriniz : ");
        double firstNumber= input.nextDouble();
        double secondNumber= input.nextDouble();
        System.out.println( "Toplam : "+(firstNumber+secondNumber));
        System.out.println("Çıkarma : "+(firstNumber-secondNumber));
        System.out.println("Bölme : "+(firstNumber/secondNumber));
        System.out.println("Çarpma : "+(firstNumber*secondNumber));


    }
}
