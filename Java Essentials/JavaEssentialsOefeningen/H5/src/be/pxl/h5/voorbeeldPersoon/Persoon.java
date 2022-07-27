package be.pxl.h5.voorbeeldPersoon;

public class Persoon {
    private String naam;
    private String voornaam;

    public Persoon(){

    }
    public Persoon(String naam, String voornaam) {
        this.naam = naam;
        this.voornaam = voornaam;
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

    public void print() {
        System.out.println("naam: " + voornaam + " " + naam);
    }
}
