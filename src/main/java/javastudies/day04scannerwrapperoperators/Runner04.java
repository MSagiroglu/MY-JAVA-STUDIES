package javastudies.day04scannerwrapperoperators;

import javaders.day04memorykullanimiwrapperclass.OgrenciEmrah;

public class Runner04 {
    public static void main(String[] args) {
        OgrenciEmrah ogreci = new OgrenciEmrah();
        System.out.println("ogreci.name = " + ogreci.name);
        System.out.println("ogreci.yas = " + ogreci.yas);
        System.out.println("ogreci.brans = " + ogreci.brans);
        ogreci.study();
        ogreci.derseDevam();


    }//main
}//class
