package be.pxl.h5.voorbeeldPersoon;

public class Student extends Persoon {
    private int leerkrediet;
    private String studentnummer;
    private String opleiding;

    public Student() {

    }

    public Student(String naam, String voornaam) {
        super(naam, voornaam);
    }

    public int getLeerkrediet() {
        return leerkrediet;
    }

    public void setLeerkrediet(int leerkrediet) {
        if (leerkredietValid(leerkrediet)) {
            this.leerkrediet = leerkrediet;
        } else {
            System.out.println("Leerkrediet moet tussen 0 en 140 liggen");
        }
    }

    public void wijzigLeerkrediet(int leerkrediet) {
        if ((this.leerkrediet + leerkrediet) >= 0 && (this.leerkrediet + leerkrediet) <= 140) {
            this.leerkrediet += leerkrediet;
        } else {
            if (leerkrediet < 0) {
                System.out.println("Je wilt " +Math.abs(leerkrediet) + " leerkrediet aftrekken maar " +Math.abs((this.leerkrediet)) + " leerkrediet kunnen nog maar worden afgetrokken");
            } else {
                System.out.println("Je wilt " +leerkrediet + " leerkrediet toevoegen maar " +((140 - this.leerkrediet) + " leerkrediet kunnen nog maar kunnen toegevoegd"));
            }
        }
    }

    public boolean leerkredietValid(int leerkrediet) {
        return leerkrediet >= 0 && leerkrediet <= 140;
    }

    public String getStudentnummer() {
        return studentnummer;
    }

    public void setStudentnummer(String studentnummer) {
        this.studentnummer = studentnummer;
    }

    public String getOpleiding() {
        return opleiding;
    }

    public void setOpleiding(String opleiding) {
        this.opleiding = opleiding;
    }

    public void print() {
        super.print();
        System.out.println("studentnummer: " + studentnummer);
        System.out.println("opleiding: " + opleiding);
        System.out.println("leerkrediet: " + leerkrediet);
    }
}
