package be.pxl.h3.oef2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class MuntApp {
    public static ArrayList<Munt> listOfCoins = new ArrayList<>();
    public static void main(String[] args){
        Munt britsePond = new Munt();
        britsePond.setNaam("Britse pond");
        britsePond.setKoers(0.985);

        Munt dollar = new Munt();
        dollar.setNaam("dollar");
        dollar.setKoers(1.287);

        Munt roebel = new Munt();
        roebel.setNaam("Russische roebel");

        Munt euro = new Munt();
        euro.setNaam("euro");
        euro.setKoers(1.000);

        listOfCoins.addAll(List.of(britsePond,dollar,roebel,euro));

        Random rng = new Random(100);

        System.out.println(ThreadLocalRandom.current().nextInt(0,5));
        System.out.println(rng.nextInt(0,200));
    }
}
