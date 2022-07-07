package be.pxl.h1.oef7;

import java.lang.reflect.Array;

public class Oefening7 {
    public static void main(String[] args){
        //array of swords
        Sword[] swords = new Sword[3];

        Sword sword = new Sword();
        sword.setDurability(33);
        sword.setMaterial("Wood");

        Sword sword2 = new Sword();
        sword2.setDurability(500);
        sword2.setMaterial("Stone");

        Sword sword3 = new Sword();
        sword3.setDurability(1500);
        sword3.setMaterial("Diamond");

        swords[0] = sword;
        swords[1] = sword2;
        swords[2] = sword3;

        System.out.println("| Materiaal| Duurzaamheid|");
        for(Sword sw : swords){
            //print out the material and durability of each sword with formatting where values are right aligned
            System.out.printf("| %9s| %12d|\n", sw.material, sw.durability);
        }
    }
}
