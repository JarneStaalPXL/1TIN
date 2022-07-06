package be.pxl.h1.oef3;

public class Oefening3 {
    public static void main(String[] args) {
        Voetballer voetballer = new Voetballer();
        voetballer.setNaam("Messi");
        voetballer.setLeeftijd(34);
        voetballer.setBeoordelingscijfer(10);
        voetballer.setTypeSpeler("Aanvaller");
        voetballer.setAantalDoelpunten(15);
        System.out.println("Voetballer is "+voetballer.berekenPrijs() + " euro waard");
    }
}
