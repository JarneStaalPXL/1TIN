package be.pxl.h5.oef3;

public class Weapon {
    int attackPower;
    Weapon(int attackPower){
        this.attackPower = attackPower;
    }

    public double doDamage(){
        return attackPower;
    }
}
