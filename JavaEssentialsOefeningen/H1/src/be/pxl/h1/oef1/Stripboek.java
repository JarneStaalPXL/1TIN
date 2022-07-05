package be.pxl.h1.oef1;

public class Stripboek {
    public String reeks = "";
    public String titel = "";
    public String album = "";
    public String auteur = "";
    boolean isGeschreven = false;

    public static void main(String[] args) {
        Stripboek stripboek = new Stripboek();
        stripboek.reeks = "H1";
        stripboek.titel = "H1-opdracht";
        stripboek.album = "H1";
        stripboek.auteur = "PXL";
        stripboek.isGeschreven = true;

        System.out.println(stripboek.isGeschreven);
        System.out.println("Het stripboek is van reeks " + stripboek.reeks + " en is van auteur " + stripboek.auteur);
    }
}
