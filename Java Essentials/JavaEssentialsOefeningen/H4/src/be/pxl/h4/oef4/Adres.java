package be.pxl.h4.oef4;

public class Adres {
    public String straat;
    public String huisNummer;
    public Gemeente gemeente;

    public Adres(String straat, String huisnummer, int postcode, String gemeente){
        setStraat(straat);
        setHuisNummer(huisnummer);
        this.gemeente = new Gemeente(postcode, gemeente);
    }

    public Gemeente getGemeente() {
        return gemeente;
    }

    public String getStraat() {
        return straat;
    }

    public void setStraat(String straat) {
        this.straat = straat;
    }

    public String getHuisnummer() {
        return huisNummer;
    }

    public void setHuisNummer(String huisNummer) {
        this.huisNummer = huisNummer;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getStraat() + " " + getHuisnummer() + "\r\n" + getGemeente().getPostcode()+ " " + getGemeente().getGemeenteNaam());
        return sb.toString();
    }
}
