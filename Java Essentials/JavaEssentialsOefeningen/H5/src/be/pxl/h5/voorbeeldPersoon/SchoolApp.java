package be.pxl.h5.voorbeeldPersoon;

import java.util.List;

public class SchoolApp {
    public static void main(String[] args) {
        Persoon p = new Persoon("Janssen", "Jan");
        Student s1 = new Student("Staal", "Jarne");

        System.out.println("Voornaam: " + s1.getVoornaam());
        System.out.println("Naam: " + s1.getNaam());
        s1.setLeerkrediet(100);
        s1.wijzigLeerkrediet(-50);
        s1.wijzigLeerkrediet(-80);
        System.out.println("Leerkrediet: " + s1.getLeerkrediet());
        s1.setStudentnummer("12345");
        s1.setOpleiding("ICT");
        s1.print();
    }
}

