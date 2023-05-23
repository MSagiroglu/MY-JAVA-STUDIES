package javastudies.day02datatypesmethodcreation;

public class MethodCreation01Deneme {
    public static void main(String[]args){
        print("My name is Mustafa SAĞIROĞLU");
        System.out.println("toplam(3,5) = " + toplam(3, 5));
        System.out.println("çarpma(3,5) = " + carpma(3, 5));
        System.out.println("kareAlan(5) = " + kareAlan(5));
        System.out.println("dikdortgenHacim(3,4,5) = " + dikdortgenHacim(3, 4, 5));

    }
    public static void print(String write){System.out.println(write);}
    public static int toplam(int a,int b){return a+b;}
    public static int carpma(int c, int d){return c*d;}
    public static int kareAlan(int kenar){return kenar*kenar;}
    public static double dikdortgenHacim(double en,double boy,double yukseklik) {
        return en*boy*yukseklik;}

}
