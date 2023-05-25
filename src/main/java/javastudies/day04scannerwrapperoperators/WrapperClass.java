package javastudies.day04scannerwrapperoperators;

public class WrapperClass {
    public static void main(String[] args) {

        //primitive     : char    -   boolean - byte - short - int     - long - float - double
        //Wrapper Class :Character -  Boolean - Byte - Short - Integer - Long - Float - Double

        //Wrapper Class'lar non-primitive'dir. o yuzden memory'de cok yer kaplarlar
        //o yuzden sart degilse wrapper class kullanmayi tercih etmeyiz
        //boyle bir imkanin varligindan da haberdar olmaliyiz

        //"n" yazip "nokta" koyarsaniz hic method goremezsiniz, cunku "primitive" ler method icermez
        int n = 12;
        //"m" yazip "nokta" koyarsaniz bircok method gorebilirsiniz, cunku wrapper class lar method icerir.
        Integer m = 12;

        byte p = 13;
        Byte r = 13;
        //ORNEK-1: short data typının min. ve max. değerlerini kod yazarak bulunuz.
        short maxShort=Short.MAX_VALUE;
        short minShort=Short.MIN_VALUE;
        System.out.println(maxShort);
        System.out.println(minShort);

        //Örnek-2:int data type'ının min. değerini byte data type'ın  ve max. değeri ile toplamını bulalım.
        int minInt =Integer.MIN_VALUE;
        byte maxByte =Byte.MAX_VALUE;
        System.out.println(maxByte+minInt);

        //Örnek-3:Primitive int'i wrapper Integer'a çeviriniz.
        int a=45;
        Integer wrapperA = a;// bu duruma Autoboxing denir.

        //Örnek-4:Wrapper Byte'ı primitive byte'a çeviriniz.
        Byte k=33;
        byte primitiveK =k;
        //Autoboxing , primitivleri non-primitive'e dönüştürmesidir.

        //Unboxing,  non-primitivleri primitivlere dönüştürmesidir.

        //Örnek-4:Primitive char 'ı wrapper Character'e çevirin.
        char sinif   ='A';
        Character karakter =sinif;
        //Örnek-5:Wrapper Boolean'ı primitive boolean'a çevirin.
        Boolean isOld= true;
        boolean isOldPr=isOld;



    }

}