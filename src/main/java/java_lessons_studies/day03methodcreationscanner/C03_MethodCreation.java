package javaders.day03methodcreationscanner;

public class C03_MethodCreation {
    public static void main(String[] args) {

        //Örnek - 1: Dikdortgenin alanini hesaplatan bir method olusturunuz
        //1.method
        System.out.println("*****4-5 br uzunluklu dikdörtgen*****");
        dikdortgenAlani1(4,5);
        //2.method
        System.out.println("*****8-10 br uzunluklu dikdörtgen*****");
        System.out.println("Dikdörtgen Alanı-2 :" + dikdortgenAlani2(8, 10));

        //Örnek - 2: Dikdortgenin alanini hesaplatan bir method olusturunuz
        //1.method
        System.out.println("*****6 br uzunluklu kare*****");
        kareninAlani1(6);
        //2.method
        System.out.println("*****8 br uzunluklu kare*****");
        kareninAlani2(8);

    }//main
    //Örnek - 1: Dikdortgenin alanini hesaplatan bir method olusturunuz

    //1.method
        public static void dikdortgenAlani1(int a,int b){
        System.out.println("Dikdörtgen Alanı-1 :"+(a*b));
    }
    //2.method
    public static int dikdortgenAlani2(int c,int d) {
        return c*d;
    }

    //Örnek - 2: Dikdortgenin alanini hesaplatan bir method olusturunuz
    //1.method
    public static void kareninAlani1 (int e){
        System.out.println("Karenin alanı-1 :"+(e*e));
    }
    //2.method
    public static int kareninAlani2 (int f){
        return f*f;
    }

}//class
