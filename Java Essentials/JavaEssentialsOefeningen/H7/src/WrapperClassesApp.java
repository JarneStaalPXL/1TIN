import be.pxl.h2.oef4.Input;

import java.math.BigInteger;

public class WrapperClassesApp {
    public static void main(String[] args) {

        // Wrapper classes are used to convert primitive data types to objects
//        Integer i = 5;
//        i = 10;
//        System.out.println(i.intValue());
//        Double d = 5.5;
//        System.out.println(d.doubleValue());
//        Character c = 'c';
//        System.out.println(c.charValue());
//
//        System.out.println(Integer.parseInt("5"));
//        System.out.println(Double.parseDouble("5.5"));

        opdracht2();

    }

    public static void opdracht1(){
        Integer userNumber = Integer.valueOf(Input.readLine("Geef een getal in: "));
        userNumber++;
        System.out.println(userNumber);
        //print bits of userNumber
        System.out.println(Integer.toBinaryString(userNumber));
    }

    public static void opdracht2(){
        BigInteger number = BigInteger.valueOf(5);
        //calculate faculty of number
        //5! = 5 * 4 * 3 * 2 * 1
        for (int i = number.intValue(); i <= 0; i--) {
            var number2 = number.multiply(BigInteger.valueOf(i));
            System.out.println(number2);
        }
    }
}
