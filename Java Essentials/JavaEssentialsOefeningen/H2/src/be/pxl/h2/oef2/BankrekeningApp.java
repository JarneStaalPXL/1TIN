package be.pxl.h2.oef2;

public class BankrekeningApp {
    public static void main(String[] args) {
        Bankrekening bankrekening = new Bankrekening("000-01574125-77", "Jef Klak", 100, 0);
        bankrekening.doeVerrichting(new double[] {-50,20});
        bankrekening.schrijfRenteBij();

        bankrekening.doeVerrichting(new double[] {500,-20});

        Bankrekening br2 = new Bankrekening("000-01574125-77", "Broski Nak", 100, 0);
        br2.doeVerrichting(new double[] {20});
    }
}
