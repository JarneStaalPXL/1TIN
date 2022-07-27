package be.pxl.h4.oef4;

import java.time.LocalDate;

public class HuwelijkApp {
    public static void main(String[] args) {
        Persoon persoon1 = new Persoon("Staal","Jarne", LocalDate.of(2001,7,27),new Adres("Daelstraat","22",3668,"As"));
        Persoon persoon2 = new Persoon("Meyers","Caro", LocalDate.of(2002,9,29),new Adres("Bessenstraat","16",3668,"Maasmechelen"));
        Huwelijk huwelijk = new Huwelijk(persoon1,persoon2,27,7,2022);

    }

}
