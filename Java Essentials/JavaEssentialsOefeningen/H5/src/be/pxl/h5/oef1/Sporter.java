package be.pxl.h5.oef1;

import be.pxl.h5.voorbeeldPersoon.Persoon;

import java.util.List;

public class Sporter extends Persoon {
    String sport;
    public static int aantalSporters = 0;

    public Sporter(String voornaam, String naam){
        super(naam, voornaam);
        this.sport = "onbepaald";
        aantalSporters++;

    }
    public Sporter(String voornaam, String naam, String sport){
        super(naam, voornaam);
        this.sport = sport;
        aantalSporters++;
    }

    public static int getAantalSporters() {
        return aantalSporters;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public void print(){
        super.print();
        System.out.println(sport);
    }

    public static void printOverview(List<Sporter> sporters){
        System.out.println("\nOverzicht voetballers volgens opstelling");

        for (String opstelling : Voetballer.opstellingen) {
            System.out.println("\n*** " + opstelling + " ***");
            for (Sporter sporter : sporters) {
                if (sporter instanceof Voetballer voetballer && voetballer.opstelling.equals(opstelling)) {
                    voetballer.print();
                }
            }
        }
    }

    public static void printOverview(List<Sporter> sporters, String excludeSport){
        System.out.println("Overzicht sporters (behalve "+excludeSport+"): ");
        for (Sporter sporter : sporters) {
            if (!sporter.sport.equals(excludeSport)){
                sporter.print();
            }
        }
    }
}
