package be.pxl.h5.oef3;

import java.util.ArrayList;

//Cannot create objects of class Human
public class Human extends Character {
    Weapon weapon;
    ArrayList<Character> defeatedEnemies = new ArrayList<Character>();
    public Human(String name) {
        super(name, 100);
    }

    public void attack(Character opponent){
        opponent.health -= weapon.doDamage();
    }

    public ArrayList<Character> getDefeatedEnemies(){
        return defeatedEnemies;
    }

    public Weapon getWeapon(){
        return weapon;
    }

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }
}
