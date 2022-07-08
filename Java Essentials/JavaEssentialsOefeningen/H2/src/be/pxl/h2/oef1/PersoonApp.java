package be.pxl.h2.oef1;

import java.time.Year;

public class PersoonApp {
    public static void main(String[] args) {
        Persoon p = new Persoon();
        p.setNaam("Staal");
        p.setVoornaam("Jarne");
        p.setGeboortejaar(Year.of(2001));
        p.setGewicht(78);
        p.setLengte(1, false);
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
    }
}
