package javastudies.day04scannerwrapperoperators;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //Kullanıcıdan alacağınız 5 basamaklı bir sayının ilk iki ve son iki basamağındaki
        //rakamların toplamını yazdıran kodu giriniz.

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen 5 basamaklı bir sayı giriniz ...");
        int number=input.nextInt();
        //Java bir tam sayıyı bir tam sayıya böldüğünde bölüm kesinlikle tam sayı yapar.
        //Java 'da: 671/10=67,1 değildir  SONUÇ:67'dir. Java yuvarlama yapmaz ,direk siler.

        //bir sayının son rakamını bulabilmek için o sayıyı 10 'a böllüp kalanı almalıyız.
        //%==> modulus operator solunda bulduğu sayının sağında bulunan sayıya bölümünden kalanı verir.
        //dolayısıyle %10  her zaman  bize  birler basamağında bul unan sayıyı verir.
        //bir tam sayıy ı bir tam sayıya bölerseniz java sonucu kesinlikle bir  tam sayı yapar.
        //java bu durumda yuvarlama yapmaz.

        //Son rakamı al.
        int lastDigit = number%10;
        //sayı küçült.
        number = number/10;
        //sondan ikinci rakamı al
        int lastSecondDigit = number%10;
        number= number/10;
        //sondan 3. rakamı al
        int lastThirdDigit =number%10;
        //sayı küçült
        number= number/10;
        //sondan 4. rakamı al
        int lastFourthDigit =number%10;
        //sayı küçült
        number= number/10;
        int lastFifthDigit =number%10;
        //sayı küçült
        number= number/10;
        System.out.println(lastDigit+lastSecondDigit+lastFourthDigit+lastFifthDigit);






    }
}
