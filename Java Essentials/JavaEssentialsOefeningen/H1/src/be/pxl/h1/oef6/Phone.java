package be.pxl.h1.oef6;

import java.util.ArrayList;
import java.util.List;

public class Phone {
    public String number;
    public String provider;
    public int numberOfCalls;
    public int numberOfFreeCalls;
    List<String> freeNumbers = List.of("112", "102", "070245245");

    public Phone() {

    }

    public Phone(String number, String provider) {
        this.number = number;
        this.provider = provider;
        this.numberOfCalls = 0;
        this.numberOfFreeCalls = 0;
    }

    public void call(String number) {
        if (freeNumbers.contains(number)) {
            this.numberOfFreeCalls++;
            System.out.println("Free call to " + number);
        } else {
            this.numberOfCalls++;
            System.out.println("Paid Call to " + number);
        }
    }

    public double getCost() {
        double price;
        double discount = 0;

        if (this.provider.equals("Floximus")) {
            price = 0.25;
            if (this.numberOfCalls >= 20) {
                discount = 0.05;
            }
        } else {
            price = 0.21;
        }

        return this.numberOfCalls * price * (1 - discount);
    }

    public void reset() {
        this.numberOfCalls = 0;
        this.numberOfFreeCalls = 0;
    }
}
