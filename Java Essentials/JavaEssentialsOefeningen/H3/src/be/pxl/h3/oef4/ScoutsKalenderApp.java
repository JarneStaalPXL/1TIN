package be.pxl.h3.oef4;

import be.pxl.h2.oef4.Input;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ScoutsKalenderApp {
    public static List<Activiteit> activiteiten = new ArrayList<>();
    public static void main(String[]args){
        int jaar = Input.readInt("Geef het jaar in: ");
        int maand = Input.readInt("Geef maandnummer in: ");

        while(activiteiten.size() <= 10) {
            int dag = Input.readInt("Geef een dag in: ");
            if (dag == 0) break;

            String activiteit = Input.readLine("Geef de activiteit in: ");
            Activiteit activiteit1 = new Activiteit(activiteit, LocalDate.of(jaar, maand, dag));
            activiteiten.add(activiteit1);
        }

        System.out.println("\n" +
                "*** Kalender voor MARCH 2022 ***");
        for (Activiteit activiteit : activiteiten) {
            //print activiteiten with date
            System.out.println(activiteit.getDatum() + "     " + activiteit.getNaam());
        }
    }
}
