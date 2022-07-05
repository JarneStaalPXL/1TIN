package be.pxl.h1.oef1;

public class Opdracht4 {
    public static void main(String[] args) {
        Auto auto = new Auto();
        auto.setMerk("Ford");
        auto.setType("Focus");

        Auto auto2 = new Auto();
        auto2.merk = "Ford";
        auto2.type = "Focus";

        System.out.println("Mijn auto is een " + auto2.getMerk() + " " + auto2.getType());
    }
}
