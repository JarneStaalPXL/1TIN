package be.pxl.h4.oef1;

public class Instrument {
    public String naam;
    public String geluid;
    public Instrument(){

    }
    public Instrument(String naam, String geluid){
        this.naam = naam;
        this.geluid = geluid;
    }

    public void speel(){
        System.out.println(geluid);
    }

    @Override
    public String toString() {
        return naam;
    }


}
