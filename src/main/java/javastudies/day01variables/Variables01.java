package javastudies.day01variables;

public class Variables01 {

    public static void main(String[] args) {  // "psvm +TAB" veya "main+ENTER"
        // Programda yorum yazmaya yarar.
        /*bu şekişde yazmakta satırlı
        yorumlar içindir. */

        //Variable oluşturmak:
        //data type + variable name + atama operatörü+ data+noktalı virgül
            int             age             =           13          ;
        /* Java Cümlesi: Statement
         *Javada "=" Atama operatörüdür(Assignment): sağdaki 13 değerini alır ve soldaki age kutusuna atar.
         * Java da eşittir demek "==" tir.
         * Java da ";" cümlenin bittiğini ifade eder.hafızada böyle bir kayıt oluşturmak istiyorum demektir.
         * data type + variable name "Variable Declaration" demektir.
         * Assignment Operator + variable değeri de "Assignment" dir.
         * Eğer Variable Declaration yapar ve Assignment yapmazsak JAVA kendi Default değerini
         * (tam sayı için 0) atar.
         *
         * Data Types: java da temel olarak 2 tip data vardır:
         * 1- Primitive Data Type:
         * char,boolean,byte,short,long,int,float,double
         * 2-Non primitive Data Type:
         * Sonsuz örnek vardır. Örnek bir tane "String"dir */


        //Örnek-1: Öğrenci ismi için variable oluşturunuz ve değer olarak Ali Can atayınız.
        //CEVAP:

        String studentName = "Ali Can";
        //variable nameler küçük harfle başlar ve camelcase olarak devam eder.
        //Stringlere verilen değerler daima çif tırnak (") içinde olmalıdır.
        //String studentName yazıca java memory içinde r"reserved area" oluşturur ve içine
        // default olarak "null" koyar.
        //null demek  içi boş obje demektir. 0 demek değildir. sıfır da bir değerdir. {} null {0} sıfırdır.


        //char data type: Tek karakterler için kullanılır. Örneğin ==> A ,x , 5 ,?

        //Örnek-2: Char data tipinde  Bir ismin ilk harfi olarak bir variable oluşturunuz ve
        // bir değer atayınız.
        //Notre: char data type değerler tek tırnak içine konulmalıdır.
        //Tek karakterde tek tırnak Çok karakterde çift tırnak konulur.

        char isminIlkHarfi = 'A';


        //boolean data type:

        //boolean 2 farklı değer alabilirler. (true) veya (false)

        //Örnek-3: boolean data tipinde emeklimisin sorusu içinbir variable oluşturun ve
        // false değerini atayın.

        boolean emeklinisin = false;

        //BYTE DATA TYPE: tam sayılar içindir. hafızada 1 byte yer kaplar.
        //byte "-128 den +127 ye kadar (dahil) tam sayı değerleri için kullanılabilir.

        //Örnek-4: Byte data type ile öğrenci yaşı için bir variable oluşturunuz ve değer atayınız.

        byte studentAge= 127;



        //short data type:
        //Tam syılar içindir ve hafızada 2 byte yer kaplar ve -32768 ile 32767 arasındaki tam
        // sayılar için kulllanılır.
        short okuldakiOgreciSayisi = 2545;

        //int data type:
        // tam sayılar içindir  ve hafızada 4 byte yer kaplar.  -2147483648 ile 2147483647 arasındadır.
        //Ön-rnek-5: Ülke nüfusu için bir variable oluşturunuz ve değer atayınız.
        int ulkeNufusu=454721486;

        //long data type:
        //tam sayılar içindir ve hafızada 8 byte yer kaplar.  -9,223,372,036,854,775,808(-2^63) to
        // 9,223,372,036,854,775,807(2^63 -1)(inclusive). arasıdır.
        // çok değer yazmak için sonuna "L(tercihen) - l" koyarsan ancak kabul eder.
        //Girilen değer int aralığında ise kabul eder.
        long cellNumberInHumanBody =502522248656154L;

        //float data type:
        //float virgüllü sayılar (Decimal Numbers=ondalık sayılar) için kullanılr.
        //Fiyatlandırmalar için kullanılabilir.
        //Java ondalıklı(decimal numbers) sayıları otomatik olarak "double" kabul eder
        // float olmasında ısrarcı isek valuenin sonuna F veya f yazılır.
        //Float memory de 4 Byte yer kaplar. Double ise 8 Byte yer kaplar.
        //Örnek-7: Gömlek ve Ayakkabı Fiyatları için iki tane variable oluşturup toplam fiyatı ekrana yazdırınız.
        float gomlekFiyati= 49.99F;
        float ayakkabiFiyati= 249.99F;

        System.out.println(gomlekFiyati+ayakkabiFiyati);
        //System.out.println(); kodu parantez içine yazdıklarımızı ekrana yazdırır.

        int a=12;
        int b=13;

        System.out.println(a+b);
        //System.out.println(); ekrana yazdırır ve pointer(imleç) bir sonraki satıra koyar.
        //System.out.print(); ise  ekrana yazdırır amapointer(imleç) aynı satırda tutar.
        int c=50;
        int d=25;
        System.out.print(c);
        System.out.print(d);
        System.out.println("-----------");

        //double data type:
        //ondalıklı syılar içinndir.(decimal numbers)
        //Double ise 8 Byte yer kaplar.

        //Örnek-8:

        double weigthOfAmimp = 0.000000032;
        double weigthOfCell  = 0.000000031;

        System.out.println(weigthOfAmimp - weigthOfCell);
    }
}
