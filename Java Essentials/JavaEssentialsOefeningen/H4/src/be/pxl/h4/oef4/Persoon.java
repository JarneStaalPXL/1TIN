package be.pxl.h4.oef4;

import java.time.LocalDate;

public class Persoon {
    private String naam;
    private String voornaam;
    private LocalDate geboortedatum;
    private Adres adres;

    public Persoon(String naam, String voornaam, int geboorteDag, int geboorteMaand, int geboorteJaar, String straat, String huisnummer, int postcode, String gemeenteNaam)
    {
        this.naam = naam;
        this.voornaam = voornaam;
        this.geboortedatum = LocalDate.of(geboorteJaar, geboorteMaand, geboorteDag);
        this.adres = new Adres(straat, huisnummer, postcode, gemeenteNaam);
    }

    public Persoon(String naam, String voornaam, LocalDate geboortedatum, Adres adres){
        this.naam = naam;
        this.voornaam = voornaam;
        this.geboortedatum = geboortedatum;
        this.adres = adres;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    public LocalDate getGeboortedatum() {
        return geboortedatum;
    }

    @Override
    public String toString() {
        return getVoornaam() + " " + getNaam() + "\r\n" + getAdres().getStraat() + " " + getAdres().getHuisnummer() + "\r\n" + getAdres().getGemeente().getPostcode() + " " + getAdres().getGemeente().getGemeenteNaam();
    }
}
