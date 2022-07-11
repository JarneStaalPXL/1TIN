package be.pxl.h3.oef2;

import java.util.Locale;

public class Munt {
    public String naam;
    public double koers;
    public static int AFRONDING = 3;
    public int aantal;

    public Munt(){

    }

    public Munt(String naam, double koers){
        this.naam = naam;
        this.koers = koers;
    }

    public String getNaam(){
        return this.naam.toUpperCase();
    }

    public void setNaam(String naam){
        this.naam = naam;
    }

    public double getKoers(){
        return Math.round(this.koers * Math.pow(10, AFRONDING)) / Math.pow(10, AFRONDING);
    }

    public void setKoers(double koers){
        this.koers = koers;
    }

    public int getAantal(){
        return this.aantal;
    }

    public int getAFRONDING(){
        return AFRONDING;
    }

}
