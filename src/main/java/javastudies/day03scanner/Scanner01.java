package javastudies.day03scanner;

//Java nın util Library den Scanner Class import edildi demektir.
import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {
        //1. adım: Scanner Class'tan bir obje oluştur.

        Scanner input=new Scanner(System.in);

        //Object ismini "input" yaptık çünkü bu object
        // kullanıcıdan alınan datayı benim kodlarımın içine koyacak.

        //2. adım:Kullanıcıya ne istediğinize dair mesaj veriniz.
        System.out.println("Lüfen Yaşınızı Giriniz...");
        //3. adım: Uygun methodu kullanarak kullanıcının verdiği
        // datayı memory'e yerleştiriniz.
        byte age =input.nextByte();
        System.out.println("Teşekkür Ederim Yaşınız : "+age);
    }
}
