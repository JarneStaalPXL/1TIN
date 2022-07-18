package be.pxl.h4.oef1;

import java.util.ArrayList;

public class BandApp {
    public static void main(String[] args) {
        ArrayList<Muzikant> leden = new ArrayList<Muzikant>();
        leden.add(new Muzikant("Jarne", new Instrument("Trompet", "Bow bow bow")));
        leden.add(new Muzikant("Marc", new Instrument("Piano", "Fa sol la si")));
        leden.add(new Muzikant("Kristel", new Instrument("Triangel", "ting tang")));

        Band band = new Band("PXL-Digital", leden);
        System.out.println(band);
        band.speel(20);
    }
}
