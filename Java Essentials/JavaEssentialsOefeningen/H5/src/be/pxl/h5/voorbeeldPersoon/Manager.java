package be.pxl.h5.voorbeeldPersoon;

public class Manager extends Werknemer {
    private double bonus;
    public static int aantalManagers = 0;

    public Manager(String naam, String voornaam, String functie, double salaris) {
        super(naam, voornaam, functie, salaris);
        setBonus(50);
        aantalManagers++;
    }

    public Manager(String naam, String voornaam, String functie, double salaris, double bonus) {
        super(naam, voornaam, functie, salaris);
        setBonus(bonus);
        aantalManagers++;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getSalaris(){
        return super.getSalaris() + bonus;
    }

    public void print() {
        super.print();
        System.out.println("bonus: " + bonus);
    }

    public double getProcAandeelManagers(){
        return ((double)aantalManagers / (double)Werknemer.aantalWerknemers)*100;
    }


}
