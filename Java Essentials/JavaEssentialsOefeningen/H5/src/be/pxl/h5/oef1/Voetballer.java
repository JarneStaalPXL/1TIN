package be.pxl.h5.oef1;

public class Voetballer extends Sporter {
    String club;
    String opstelling;
    static final String[] opstellingen = {"middenvelder", "aanvaller", "verdediger", "onbepaald"};

    public Voetballer(String voornaam, String naam, String club, String opstelling) {
        super(voornaam, naam, "voetbal");
        this.club = club;

        for (String opst : getOpstellingen()){
            if (opstelling.equals(opst)) {
                this.opstelling = opst;
                break;
            } else {
                this.opstelling = "onbepaald";
            }
        }

    }

    public Voetballer(String voornaam, String naam) {
        super(voornaam, naam, "voetbal");
        this.club = "onbepaald";
        this.opstelling = "onbepaald";
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getOpstelling() {
        return opstelling;
    }

    public void setOpstelling(String opstelling) {
        this.opstelling = opstelling;
    }

    public String[] getOpstellingen() {
        return opstellingen;
    }

    public void print() {
        super.print();
        System.out.println("club: "+club + " opstelling: " + opstelling);
    }
}
