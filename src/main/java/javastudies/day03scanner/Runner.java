package javastudies.day03scanner;

public class Runner {
    public static void main(String[] args) {
        //object nasıl oluşturulur?
        //Class ismi + Object ismi + Atama Operatorü + "new" + Constructor
              Car myCar             =           new Car();
        //"new" keyword' u sıfırdan yeni bir object oluşturmak için kullanılır.
        //Constructor Java'da nesneleri oluşturmak için kullanılan özel bir methoddur.
        System.out.println(myCar.fiyat);
        System.out.println("myCar.model = " + myCar.model);
        myCar.dur();
        myCar.hareket();

        Student ogrenci1 =new Student();
        System.out.println("ogrenci1.ogrenciName = " + ogrenci1.ogrenciName);
        System.out.println("ogrenci1.grade = " + ogrenci1.grade);
        System.out.println("ogrenci1.address = " + ogrenci1.address);
        ogrenci1.study();
        ogrenci1.feed();
        System.out.println( ogrenci1.ogrenciName +"  "+ ogrenci1.grade);//başka yöntem
        //Sonucu: Tom Hanks  8

    }
}
