package be.pxl.h4.oef3;

import java.util.ArrayList;
import java.util.List;

public class Lector {
    public String voorNaam;
    public String achterNaam;
    public List<Vak> vakken;
    public double aanstellingsPercentage;
    public static List<Lector> lectorList = new ArrayList<Lector>();
    public Lector(){
        vakken = new ArrayList<Vak>();
        lectorList.add(this);
    }

    public String getVoorNaam() {
        return voorNaam;
    }

    public void setVoorNaam(String voorNaam) {
        this.voorNaam = voorNaam;
    }

    public String getAchterNaam() {
        return achterNaam;
    }

    public void setAchterNaam(String achterNaam) {
        this.achterNaam = achterNaam;
    }

    public List<Vak> getVakken() {
        return vakken;
    }

    public void setVakken(List<Vak> vakken) {
        this.vakken = vakken;
    }

    public double getAanstellingsPercentage() {
        return aanstellingsPercentage;
    }

    public void setAanstellingsPercentage(double aanstellingsPercentage) {
        if (aanstellingsPercentage > 100) {
            throw new IllegalArgumentException("Aanstellingspercentage mag niet groter zijn dan 100%");
        }
        this.aanstellingsPercentage = aanstellingsPercentage;
    }

    public void vakkenToevoegen(List<Vak> vakken) {
        for (Vak vak : vakken) {
            if(vak == null){
                throw new IllegalArgumentException("Vak mag niet null zijn");
            }
            if (vak.aantalStudiepunten > 18) {
                throw new IllegalArgumentException("Een vak kan nooit meer dan 18 studiepunten zijn.");
            }
            if (this.vakken.size() == 5) {
                throw new IllegalArgumentException("Een lector kan nooit meer dan 5 vakken hebben.");
            }
            this.vakken.add(vak);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Leraar ").append(voorNaam).append(" ").append(achterNaam).append(" is aangesteld voor ").append(aanstellingsPercentage).append("%\n");
        sb.append("Volgende vakken behoren tot het takenpakket:");
        for (Vak vak : vakken) {

            sb.append("\n     ").append(vak.code).append("    ").append(pad(vak.naam,25));
            sb.append(vak.aantalStudiepunten);
        }
        return sb.toString();
    }

    //function to pad strings with spaces
    public String pad(String s, int length) {
        StringBuilder sb = new StringBuilder(s);
        while (sb.length() < length) {
            sb.append(" ");
        }
        return sb.toString();
    }
}
