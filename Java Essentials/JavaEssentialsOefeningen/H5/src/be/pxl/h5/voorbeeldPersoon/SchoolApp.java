package be.pxl.h5.voorbeeldPersoon;

import java.util.List;

public class SchoolApp {
    public static void main(String[] args) {
//        Persoon p = new Persoon("Janssen", "Jan");
//        Student s1 = new Student("Staal", "Jarne");
//
//        System.out.println("Voornaam: " + s1.getVoornaam());
//        System.out.println("Naam: " + s1.getNaam());
//        s1.setLeerkrediet(100);
//        s1.wijzigLeerkrediet(-50);
//        s1.wijzigLeerkrediet(-80);
//        System.out.println("Leerkrediet: " + s1.getLeerkrediet());
//        s1.setStudentnummer("12345");
//        s1.setOpleiding("ICT");
//        s1.print();

        Persoon werknemer1 = new Werknemer("Staal","Jarne","programmeur",2000);
        Persoon werknemer2 = new Werknemer("Janssen","Jan");
        werknemer1.print();
        werknemer2.print();
        System.out.println("Aantal werknemers: " + Werknemer.aantalWerknemers);

        Manager manager1 = new Manager("Janssen","Jan","manager",2000,50);
        manager1.print();
        System.out.println("Aantal managers: " + Manager.aantalManagers);
        System.out.println("Procentage managers: " + String.format("%.2f", manager1.getProcAandeelManagers())+"%");
    }
}

