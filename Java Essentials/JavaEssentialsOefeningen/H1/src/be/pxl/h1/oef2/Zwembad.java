package be.pxl.h1.oef2;

public class Zwembad {
    public double lengte;
    public double breedte;
    public double diepte;

    public double getVolume(){
        return (double)(lengte * breedte * diepte);
    }

    public double getVolumeWater(){
        var liter = getVolume()*1000;
        return liter - getVolumeOntsmettingsmidel(); // omzetten naar liter (dm3 => 1liter) en aftrekken van het volume van het ontsmettingsmiddel
    }

    public double getVolumeOntsmettingsmidel(){
        return (getVolume() * 0.2)*100;
    }
}
