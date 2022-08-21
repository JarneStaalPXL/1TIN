package be.pxl.h5.oef1;

import java.util.ArrayList;
import java.util.List;

public class SportApp {
    //create and fill list of sporter
    public static List<Sporter> sporters = new ArrayList<Sporter>(
            List.of(new Voetballer("Jarne", "Staal", "FC Utrecht", "aanvaller"),
                    new Sporter("Marc", "Staal", "zwemmen")));

    public static void main(String[] args) {
        Sporter.printOverview(sporters, "voetbal");
        Sporter.printOverview(sporters);
    }
}
