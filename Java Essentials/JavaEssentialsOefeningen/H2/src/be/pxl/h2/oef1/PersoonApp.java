package be.pxl.h2.oef1;

import java.time.Year;

public class PersoonApp {
    public static void main(String[] args) {
        Persoon p = new Persoon();
        p.setNaam("Staal");
        p.setVoornaam("Jarne");
        p.setGeboortejaar(Year.of(2001));
        p.setGewicht(78);
        p.setLengte(1.80);
        var personOutput = p.toString();
        System.out.println(personOutput);
    }
}
