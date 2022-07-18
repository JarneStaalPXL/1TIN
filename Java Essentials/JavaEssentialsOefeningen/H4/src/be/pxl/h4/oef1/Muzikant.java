package be.pxl.h4.oef1;

public class Muzikant {
    public String naam;
    public Instrument instrument;
    public Muzikant(String naam, Instrument instrument){
        this.naam = naam;
        this.instrument = instrument;
    }

    public void setInstrument(Instrument instrument){
        this.instrument = instrument;
    }

    public void speel(){
        instrument.speel();
    }

    @Override
    public String toString(){
        return naam + " ["+instrument+"]";
    }
}
