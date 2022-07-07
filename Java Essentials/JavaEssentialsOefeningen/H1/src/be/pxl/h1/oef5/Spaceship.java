package be.pxl.h1.oef5;

import java.awt.*;

public class Spaceship {
    public String name;
    public int hits; //amount of hits the spaceship has taken
    public boolean shieldOn; //if true, spaceship cannot be hit

    public Spaceship(){

    }

    public Spaceship(String name, int hits, boolean shieldon){
        this.name = name;
        this.hits = hits;
        this.shieldOn = shieldon;
    }

    public void setShieldOn(boolean shieldOn){
        this.shieldOn = shieldOn;
        System.out.println(this.name + " puts shield on.");
    }

    public void fire(Spaceship spaceship){
        //if shield of other spaceship is not on, it can be hit
        if(!spaceship.shieldOn){
            //able to be hit
            spaceship.hits++;
            System.out.println(name + " fires at "+  spaceship.name);
        }
        else {
            //ship that fires will be attacked
            this.hits++;

            //Toon ook een gepaste
            //melding: bv. <name> fires at <other_name>
            System.out.println(spaceship.name + " fires at "+  name);
        }
    }

    public boolean isDestroyed(){
        //if spaceship is 5 times hit, it's destroyed
        boolean isDead;
        if(this.hits >= 5){
            isDead = true;
        }
        else {
            isDead = false;
        }


        if(isDead) System.out.println(this.name +" is dead.");
        else System.out.println(this.name +" is alive and can take "+ (Math.max((5 - this.hits), 0)) + " hits.");
        return isDead;
    }

}
