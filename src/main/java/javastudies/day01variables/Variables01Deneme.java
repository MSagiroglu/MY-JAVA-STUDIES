package javastudies.day01variables;

public class Variables01Deneme {
    public static void main(String[]args){
        //Örnek-1: Öğrenci ismi için variable oluşturunuz ve değer olarak Ali Can atayınız.
        //CEVAP:
        String studentName="Mustafa SAĞIROĞLU";// OR

        String studentName2;//ŞEKLİNDE DEKLARE EDİLİP
        studentName2="Ali Asım SAĞIROĞLU";// ŞEKLİNDE DEĞER VERİLEBİLİR.

        //Örnek-2: Char data tipinde  Bir ismin ilk harfi olarak bir variable oluşturunuz ve
        // bir değer atayınız.
        char firstCharacterOfName ='M';//OR

        char firstCharacterOfName2;//ŞEKLİNDE DEKLARE EDİLİP
        firstCharacterOfName2='M'; //ŞEKLİNDE DEĞER VERİLEBİLİR.

        //Örnek-3: boolean data tipinde emeklimisin sorusu içinbir variable oluşturun ve
        // false değerini atayın.
        boolean emeklimisin = false;//OR

        boolean emeklimisin2;//ŞEKLİNDE DEKLARE EDİLİP
        emeklimisin2=false;//ŞEKLİNDE DEĞER VERİLEBİLİR.

        //Örnek-4: Byte data type ile öğrenci yaşı için bir variable oluşturunuz ve değer atayınız.
        byte studentOld= 127;//OR

        byte studentOld2;//ŞEKLİNDE DEKLARE EDİLİP
        studentOld2=127;//ŞEKLİNDE DEĞER VERİLEBİLİR.

        //Örnek-5: Short data type ile Okul nüfusu için bir variable oluşturunuz ve değer atayınız.
        short schoolPopulation=2500;

        //Örnek-6: İnt data type ile Ülke nüfusu için bir variable oluşturunuz ve değer atayınız.
        int populationOfCountry = 150000000;

        //Örnek-7: İnt data type ile Dünya nüfusu için bir variable oluşturunuz ve değer atayınız.
        long populationOfWorld=7000000000L;

        //Örnek-8: Float data type ile Gömlek ve Ayakkabı Fiyatları için iki tane variable oluşturup toplam fiyatı ekrana yazdırınız.
        float shirtPrice=4.99F;
        float shoesPrice=12.45F;
        System.out.println(shoesPrice+shirtPrice);//sou+Tab ekrana yazdırır ve pointer(imleç) bir sonraki satıra koyar.

        //Örnek-9: Double data type ile bir decimal variable oluşturunuz ve değer atayınız.
        double weightOfAmip=0.0000000025;
        double weightOfCell=0.00000001;

        System.out.println("(weightOfCell-weightOfAmip) = " + (weightOfCell - weightOfAmip));


    }
}
