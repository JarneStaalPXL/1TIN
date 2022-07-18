package be.pxl.h3.oef2;

import java.text.MessageFormat;
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
        roebel.setKoers(86.950);

        Munt euro = new Munt();
        euro.setNaam("euro");
        euro.setKoers(1.000);

        listOfCoins.addAll(List.of(britsePond,dollar,roebel,euro));

        for(Munt munt : listOfCoins){
            System.out.printf(munt.getKoers() + " " + munt.getNaam()+"\n");
        }
        System.out.println("Overzicht koersen tov BRITSE POND: 1 BRITSE POND = ");
        for(Munt munt : listOfCoins){
            //calculate difference between munt and britsePond
            if(!munt.equals(listOfCoins.get(0))){
                var difference = munt.getKoers() / britsePond.getKoers();

                System.out.printf(difference+ " " + munt.getNaam()+"\n");
            }
        }



//        Random rng = new Random(100);
//
//        System.out.println(ThreadLocalRandom.current().nextInt(0,5));
//        System.out.println(rng.nextInt(0,200));
    }
}
