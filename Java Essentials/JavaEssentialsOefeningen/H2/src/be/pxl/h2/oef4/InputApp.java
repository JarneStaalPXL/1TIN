package be.pxl.h2.oef4;

public class InputApp {
    public static void main(String[] args){
        String naam = Input.readLine("Geef je naam in:");
        int leeftijd = Input.readInt("Geef je leetijd in:");
        System.out.println("Welkom, " + naam);
        System.out.println("Wauw, al " + leeftijd + "?");
    }
}
