package introductions.day03scanner;

public class Car {

    //Variable oluşturalım:
    public String model = "Corolla";
    public int fiyat = 20000;

    //Method' lar oluşturalım:
    //Note:"return type void olduğunda method içinde return keyword u kullanılmaz.
    //eğer bir method yeni bir data üretmiyorsa ,sadece bir yazı yazıyorsa return type 'ı void olur.
    public void hareket(){
        System.out.println("Corolla hızlı hareket eder...");
    }
    public void dur(){
        System.out.println("Corolla güvenli bir şekilde durur...");
    }

}
