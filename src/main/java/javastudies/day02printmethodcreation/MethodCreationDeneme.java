package javastudies.day02printmethodcreation;

public class MethodCreationDeneme {
    public static void main(String[] args) {
        //ÖRNEK - 1: karenin alanını veren kodu yazınız.
        //1. method
        System.out.println("*****ÖRNEK - 1*****");
        System.out.println("*****1. method*****");
        kareAlanı(5);

        //2. method
        System.out.println("*****2. method*****");
        System.out.println("Kare alanı2 = " + kareAlani2(4));

        //ÖRNEK - 2:Dikdörtgenin alanını veren kodu yazınız.
        //1. method
        System.out.println("*****ÖRNEK - 2*****");
        System.out.println("*****1. method*****");
        dikdorgtenAlani(5,4);
        //2. method
        System.out.println("*****2. method*****");
        System.out.println("Dikdorgten Alani2 = " + dikdorgtenAlani2(5, 4));


    }
    //ÖRNEK - 1: karenin alanını veren kodu yazınız.
    //1. method
    public static void kareAlanı(int a){
        System.out.println("Kare alanı = "+(a*a));}

    //2. method
    public static int kareAlani2(int a){
        return a*a;}

    //ÖRNEK - 2:Dikdörtgenin alanını veren kodu yazınız.
    //1. method
    public static void dikdorgtenAlani(int kisaKenar,int uzunKenar){
        System.out.println("Dikdörtgenin alanı = "+kisaKenar*uzunKenar);}

    //2. method
    public static int dikdorgtenAlani2(int kısKen,int uzKenar){
        return kısKen*uzKenar;
    }
}
