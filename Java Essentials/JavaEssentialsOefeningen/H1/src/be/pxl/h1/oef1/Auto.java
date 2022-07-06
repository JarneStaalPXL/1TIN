package be.pxl.h1.oef1;

public class Auto {
    public String merk = "";
    public String type = "";

    public Auto(){

    }
    public Auto(String merk, String type) {
        this.merk = merk;
        this.type = type;
    }
    public void setMerk(String merk){
        this.merk = merk;
    }
    public void setType(String type){
        this.type = type;
    }

    public String getMerk(){
        return merk;
    }

    public String getType(){
        return type;
    }
}
