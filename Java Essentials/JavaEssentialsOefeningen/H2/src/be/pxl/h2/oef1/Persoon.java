package be.pxl.h2.oef1;

import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.time.Year;

public class Persoon {
    public String voornaam;
    public String naam;
    public double lengte;
    public double gewicht;
    public Year geboortejaar;

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setLengte(double lengte) {
        this.lengte = lengte;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    public void setGeboortejaar(Year geboortejaar) {
        this.geboortejaar = geboortejaar;
    }

    public double berekenBMI(){
        return gewicht / (lengte * lengte);
    }

    @Override
    public String toString() {
        //return a formatted string where value are length of 10
        var gewicht = MessageFormat.format("\ngewicht : {0}", this.gewicht);
        var lengte = MessageFormat.format("\nlengte : {0}", this.lengte);
        var geboortejaar = MessageFormat.format("\ngeboortejaar : {0}", this.geboortejaar);
        DecimalFormat df = new DecimalFormat("0.00");
        gewicht = MessageFormat.format("\ngewicht : {0}", df.format(this.gewicht));
        lengte = MessageFormat.format("\nlengte : {0}", df.format(this.lengte));
        return "Deze persoon is " + voornaam + " " + naam + gewicht + lengte + geboortejaar;
    }
}
