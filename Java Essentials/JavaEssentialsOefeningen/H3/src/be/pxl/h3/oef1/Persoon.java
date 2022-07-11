package be.pxl.h3.oef1;

import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.time.LocalDate;
import java.time.Year;

public class Persoon {
    public String voornaam;
    public String naam;
    public double lengte;
    public double gewicht;
    public LocalDate geboortedatum;

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
        this.geboortedatum = persoon.geboortedatum;
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

    public LocalDate getGeboortedatum() {
        return geboortedatum;
    }

    public int getLeeftijd(){
        //calculate age with LocalDate
        int age = Year.now().getValue() - geboortedatum.getYear();
        return age;
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

    public void setGeboortedatum(LocalDate geboortedatum) {
        this.geboortedatum = geboortedatum;
    }

    public double berekenBMI(){
        //limit double with 1 decimal with Math class
        return (double) Math.round(gewicht / (lengte * lengte));
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
        StringBuilder sb = new StringBuilder();
        for(String voornaam : voornamen){
            sb.append(" ").append(voornaam);
        }
        this.voornaam += sb.toString();
    }

    public String geefNaamAfgekort(){
        StringBuilder sb = new StringBuilder();
        //get first letter of voornaam and uppercase
        sb.append(Character.toUpperCase(voornaam.charAt(0)));
        sb.append('.');
        sb.append(naam.substring(0, 1).toUpperCase()).append(naam.substring(1));
        return sb.toString();
    }

    public String encrypteerNaam(int getal){
        var shortName = geefNaamAfgekort();
        StringBuilder sb = new StringBuilder();
        if(getal >= 1 && getal <= 20){
            //take the next letter for each char in shortName
            for(int i = 0; i < shortName.length(); i++){
                //get next letter in alpabet
                char letter = (char) (shortName.charAt(i) + getal);
                sb.append(letter);
            }
        }
        return sb.toString();
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
        var bmi = MessageFormat.format("\nbmi : {0}", berekenBMI());
        var geboortejaar = MessageFormat.format("\ngeboortedatum : {0}", this.geboortedatum);
        DecimalFormat df = new DecimalFormat("0.00");
        gewicht = MessageFormat.format("\ngewicht : {0}", df.format(this.gewicht));
        lengte = MessageFormat.format("\nlengte : {0}", df.format(this.lengte));
        return "Deze persoon is " + voornaam.toUpperCase() + " " + naam.toUpperCase() + gewicht + lengte + geboortejaar;
    }
}
