package be.pxl.h5.voorbeeldPersoon;

public class Werknemer extends Persoon {
    String functie;
    double salaris;
    final double MIN_SALARY  =1000;
    static int aantalWerknemers = 0;

    public Werknemer(String naam, String voornaam) {
        super(naam, voornaam);
        setSalaris(1800);
        setFunctie("algemeen bediende");
        aantalWerknemers++;
    }

    public Werknemer(String naam, String voornaam, String functie, double salaris){
        super(naam, voornaam);
        setFunctie(functie);
        setSalaris(salaris);
        aantalWerknemers++;
    }

    public String getFunctie() {
        return functie;
    }

    public void setFunctie(String functie) {
        this.functie = functie;
    }

    public double getSalaris() {
        return salaris;
    }

    public void setSalaris(double salaris) {
        if(salaris < MIN_SALARY) {
            throw new IllegalArgumentException("Salaris is te laag. Deze moet boven de " + getMIN_SALARY() + " euro zijn.");
        }
        this.salaris = salaris;
    }

    public double getMIN_SALARY() {
        return MIN_SALARY;
    }

    public void print() {
        super.print();
        System.out.println("functie: " + functie);
        System.out.println("salaris: " + salaris);
    }
}
