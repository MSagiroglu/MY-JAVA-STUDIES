package javastudies.day01variablescanner;

public class Variables {

    //byte, short, integer,long, double, float
    // veri tiplerinin max ve min degerlerini yazdiralim.

    public static void main(String[] args) {
        byte byteMax=Byte.MAX_VALUE;
        byte byteMin =Byte.MIN_VALUE;
        System.out.println("byteMax : "+byteMax);//byteMax : 127
        System.out.println("byteMin = " + byteMin);//soutv  byteMin = -128
//ctrl+z==>geri al
        System.out.println("-----------------------");
        short shortMax=Short.MAX_VALUE;
        short shortMin=Short.MIN_VALUE;
        System.out.println("shortMin = " + shortMin);
        System.out.println("shortMax = " + shortMax);
        System.out.println("-----------------------");
        int maxInt=Integer.MAX_VALUE;
        int minInt=Integer.MIN_VALUE;
        System.out.println("minInt = " + minInt);
        System.out.println("maxInt = " + maxInt);
        System.out.println("-----------------------");
        long minLong=Long.MIN_VALUE;
        long maxLong=Long.MAX_VALUE;
        System.out.println("minLong = " + minLong);
        System.out.println("maxLong = " + maxLong);
        System.out.println("-----------------------");
        float minFloat=Float.MIN_VALUE;
        float maxFloat=Float.MAX_VALUE;
        System.out.println("minFloat = " + minFloat);
        System.out.println("maxFloat = " + maxFloat);
        System.out.println("-----------------------");
        double minDouble=Double.MIN_VALUE;
        double maxDouble=Double.MAX_VALUE;
        System.out.println("minDouble = " + minDouble);
        System.out.println("maxDouble = " + maxDouble);


    }//main body
}//class body