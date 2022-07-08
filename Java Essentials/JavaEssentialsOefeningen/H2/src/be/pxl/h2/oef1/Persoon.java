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

    public Persoon(){

    }
    public Persoon(String naam, String voornaam){
        this.naam = naam;
        this.voornaam = voornaam;
    }

    public Persoon(Persoon persoon){
        this.naam = persoon.naam;
        this.voornaam = persoon.voornaam;
        this.lengte = persoon.lengte;
        this.gewicht = persoon.gewicht;
        this.geboortejaar = persoon.geboortejaar;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public String getNaam() {
        return naam;
    }

    public double getLengte() {
        return lengte;
    }

    public double getGewicht() {
        return gewicht;
    }

    public Year getGeboortejaar() {
        return geboortejaar;
    }

    public int getLeeftijd(){
        return Year.now().getValue() - geboortejaar.getValue();
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setLengte(double lengte, boolean add) {
        if(lengte > 2.40){
            if(add) this.lengte += 2.40;
            else this.lengte = 2.40;
        }
        else if(add) this.lengte += lengte;
        else this.lengte = lengte;
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

    public String geefOmschrijving(){
        double bmi = berekenBMI();
        String omschrijving = "";
        if(bmi < 18){
            omschrijving = "ondergewicht";
        }
        else if(bmi >= 18 && bmi < 25){
            omschrijving = "normaal";
        }
        else if(bmi >= 25 && bmi < 30){
            omschrijving = "overgewicht";
        }
        else if(bmi >= 30 && bmi < 40){
            omschrijving = "obesitas";
        }
        else if(bmi >= 40){
            omschrijving = "morbide obesitas";
        }

        return omschrijving;
    }

    public void voegVoornamenToe(String[] voornamen){
        for(String voornaam : voornamen){
            this.voornaam += (" " + voornaam);
        }
    }

    public void groei(){
        setLengte(0.01,true);
    }

    public void groei(double aantalCm){
        aantalCm = aantalCm/100;
        setLengte(aantalCm,true);
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
