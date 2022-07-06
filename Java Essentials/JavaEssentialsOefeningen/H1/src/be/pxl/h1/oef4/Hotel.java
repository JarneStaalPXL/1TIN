package be.pxl.h1.oef4;

public class Hotel {
    public String hotelcode;
    public int sterren; //1 tot 5
    public Character kindercode; //A t.e.m. Z

    public void setHotelcode(String hotelcode) {
        this.hotelcode = hotelcode;
    }

    public String getSterren() {
        StringBuilder sterrenString = new StringBuilder();
        for (int i = 0; i < this.sterren; i++) {
            sterrenString.append("*");
        }
        return sterrenString.toString();
    }

    public void setAantalSterren(int aantalSterren) {
        this.sterren = aantalSterren;
    }

    public Character getKindercode() {
        return kindercode;
    }

    public void setKindercode(Character kindercode) {
        this.kindercode = kindercode;
    }

    public double getPrijs() {
        double prijs = 0;
        if (this.sterren == 1 || this.sterren == 2) {
            prijs = 48;
        }
        else if (this.sterren == 3) {
            if (this.hotelcode.equals("BR") || this.hotelcode.equals("AN")) {
                prijs = 60;
            } else {
                prijs = 56;
            }
        }
        else if(this.sterren == 4 || this.sterren == 5) {
            prijs = 60;
        }

        if(this.hotelcode.equals("HI")){
            prijs = 70;
        }

        return prijs;
    }

    public double getPrijsKind(){
        double prijs = 0;
        if (this.kindercode.equals("A") || this.hotelcode.equals("HA")) {
            prijs = getPrijs() - (getPrijs() *50) /100;
        }
        return prijs;
    }
}