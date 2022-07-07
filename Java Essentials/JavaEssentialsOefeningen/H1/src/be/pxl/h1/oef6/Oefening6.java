package be.pxl.h1.oef6;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;

public class Oefening6 {
    public static void main(String[] args){
        try {
            System.setOut(new java.io.PrintStream(System.out, true, StandardCharsets.UTF_8.name()));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }

        Phone phone = new Phone("0483120249","Floximus");

        //Keep calling consecutively from number 012123410 till 012123430
        for(int i = 10; i <= 30; i++){
            phone.call("0121234" + i);
        }
        phone.call("070245245");


        DecimalFormat format = new DecimalFormat("0.00");

        System.out.println("\nNumber of paid calls: " + phone.numberOfCalls);
        System.out.println("Number of free calls: " + phone.numberOfFreeCalls);

        System.out.println("\nTotal cost: €" + format.format(phone.getCost()));
        phone.reset();
        System.out.println("Phone cost after reset: €" + format.format(phone.getCost()));
    }
}
