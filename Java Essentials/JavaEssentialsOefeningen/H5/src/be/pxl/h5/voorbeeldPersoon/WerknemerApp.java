package be.pxl.h5.voorbeeldPersoon;

public class WerknemerApp {
    public static void main(String[] args) {
        Werknemer werknemer1 = new Werknemer("Janssen", "Jan");
        werknemer1.print();
        Werknemer werknemer2 = new Werknemer("Janssen", "Jan", "algemeen bediende", 1800);
        werknemer2.print();
        Manager manager1 = new Manager("Janssen", "Jan", "algemeen bediende", 1800, 50);
        manager1.print();
        System.out.println("Aantal werknemers: " + Werknemer.aantalWerknemers);
        System.out.println("Aantal managers: " + Manager.aantalManagers);
        System.out.println("Procentage managers: " + String.format("%.2f", manager1.getProcAandeelManagers())+"%");
    }
}
