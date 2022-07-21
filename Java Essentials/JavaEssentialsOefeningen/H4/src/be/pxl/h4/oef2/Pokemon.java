package be.pxl.h4.oef2;

public class Pokemon {
    public String naam = "";
    public String type = "";
    public Pokemon(String naam, String type) {
        this.naam = naam;
        this.type = type;
    }

    public String getNaam() {
        return naam;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return getNaam() + "( " + getType() + " )";
    }
}
