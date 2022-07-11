package be.pxl.h3.oef1;

import java.time.LocalDate;
import java.time.Year;

public class PersoonApp {
    public static void main(String[] args) {
        Persoon p = new Persoon();
        p.setNaam("Langkous");
        p.setVoornaam("Pipi");
        p.setGeboortedatum(LocalDate.of(2001,7,27));
        p.setGewicht(78);
        p.setLengte(1.80, false);
        p.voegVoornamenToe(new String[] {"Bart", "Jos", "Klaas"});
        var personOutput = p.toString();
        System.out.println(personOutput);
        System.out.println("Leeftijd is: "+p.getLeeftijd());
        System.out.println("BMI: "+p.geefOmschrijving());

        System.out.println("We voegen 1cm toe");
        p.groei();
        System.out.println("Lengte = "+ p.getLengte());

        System.out.println("Zou nu 1,01 meter moeten zijn");
        System.out.println("We voegen er nu 20cm aan toe");
        p.groei(20);
        System.out.println("Lengte = "+ p.getLengte());

        Persoon p2 = new Persoon("onbekend","onbekend");
        System.out.println("\nPersoon 2: "+ p2.toString());

        Persoon p3 = new Persoon(p);
        System.out.println("\nPersoon 3: "+ p3.toString());
        System.out.println("Encrypted name is: "+ p.encrypteerNaam(1));


        //5.
        Persoon ps4 = new Persoon();
        ps4.setNaam("Smits");
        ps4.setVoornaam("Bart");
        ps4.setGeboortedatum(LocalDate.of(2001,7,27));
        ps4.setGewicht(Math.random() * (100 - 40) + 40);
        ps4.setLengte(Math.random() * (1.57 - 2.10) + 2.10, false);
        System.out.println("\n"+ps4.toString());
        System.out.println("Afgekorte naam: "+ps4.geefNaamAfgekort());
        System.out.println("Encrypted name is: "+ps4.encrypteerNaam((int) (Math.random() * (1 - 20) +20)));
    }
}
