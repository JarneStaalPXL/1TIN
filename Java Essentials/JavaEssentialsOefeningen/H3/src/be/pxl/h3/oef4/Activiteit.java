package be.pxl.h3.oef4;

import java.time.LocalDate;

public class Activiteit {
    public String naam;
    public LocalDate datum;

    public Activiteit(String naam, LocalDate datum) {
        this.naam = naam;
        this.datum = datum;
    }

    public String getNaam() {
        return naam;
    }

    public LocalDate getDatum() {
        return datum;
    }

    @Override
    public String toString() {
        return "Activiteit{" +
                "naam='" + naam + '\'' +
                ", datum=" + datum +
                '}';
    }
}
