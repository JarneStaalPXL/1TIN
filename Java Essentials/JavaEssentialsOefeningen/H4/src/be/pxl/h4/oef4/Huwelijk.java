package be.pxl.h4.oef4;

import org.w3c.dom.Text;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class Huwelijk {
    public Persoon partner1;
    public Persoon partner2;
    public LocalDate huwelijksdatum;
    public static final Locale BELGIUM_LOCALE = Locale.forLanguageTag("nl-BE");

    public Huwelijk(Persoon persoon1, Persoon persoon2, int dayOfMonth, int month, int year) {
        this.partner1 = persoon1;
        this.partner2 = persoon2;
        this.huwelijksdatum = LocalDate.of(year, month, dayOfMonth);

        this.partner2.setAdres(getPartner1().getAdres());

        StringBuilder sb = new StringBuilder();

        sb.append(getPartner1().getVoornaam()).append(" ").append(getPartner1().getNaam()).append(" en ").append(getPartner2().getVoornaam()).append(" ").append(getPartner2().getNaam());
        sb.append(" zijn gehuwd op ").append(getHuwelijksdatum().getDayOfMonth()).append(" ").append(       getHuwelijksdatum().getMonth().getDisplayName(TextStyle.FULL, BELGIUM_LOCALE)).append(" ");
        sb.append(getHuwelijksdatum().getYear()).append(". Proficiat!");
        System.out.println(sb.toString());
    }

    public Persoon getPartner1() {
        return partner1;
    }

    public void setPartner1(Persoon partner1) {
        this.partner1 = partner1;
    }

    public Persoon getPartner2() {
        return partner2;
    }

    public void setPartner2(Persoon partner2) {
        this.partner2 = partner2;
    }

    public LocalDate getHuwelijksdatum() {
        return huwelijksdatum;
    }

    public void setHuwelijksdatum(LocalDate huwelijksdatum) {
        this.huwelijksdatum = huwelijksdatum;
    }

    public void adresWijziging(String straat, String huisnumer, int postcode, String gemeenteNaam){
        this.partner1.getAdres().setStraat(straat);
        this.partner1.getAdres().setHuisNummer(huisnumer);
        this.partner1.getAdres().getGemeente().setGemeenteNaam(gemeenteNaam);
        this.partner1.getAdres().getGemeente().setPostcode(postcode);


        this.partner2.getAdres().setStraat(straat);
        this.partner2.getAdres().setHuisNummer(huisnumer);
        this.partner2.getAdres().getGemeente().setGemeenteNaam(gemeenteNaam);
        this.partner2.getAdres().getGemeente().setPostcode(postcode);
    }

    public void print(){
        System.out.println(getPartner1().toString());
        System.out.println(getPartner2().toString());
        System.out.println("Het huwelijks vond plaats op "+getHuwelijksdatum().getDayOfMonth()+" "+getHuwelijksdatum().getMonth()+" "+getHuwelijksdatum().getYear());
    }
}
