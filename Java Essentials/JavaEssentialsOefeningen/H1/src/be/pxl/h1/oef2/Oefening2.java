package be.pxl.h1.oef2;

import java.util.Scanner;

public class Oefening2 {
    public static void main(String[] args) {
        Zwembad zwembad = new Zwembad();
        zwembad.lengte = 12.5;
        zwembad.breedte = 25;
        zwembad.diepte = 1.2;

        Scanner in = new Scanner(System.in);
        System.out.print("Geef de breedte van het zwembad: ");
        zwembad.breedte = in.nextDouble();
        System.out.print("Geef de lengte van het zwembad: ");
        zwembad.lengte = in.nextDouble();
        System.out.print("Geef de diepte van het zwembad: ");
        zwembad.diepte = in.nextDouble();
        System.out.println("Liter water: " + zwembad.getVolumeWater());
        System.out.println("Liter ontsmettingsmidel: " + zwembad.getVolumeOntsmettingsmidel());
    }
}
