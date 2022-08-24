package be.pxl.h5.oef3;

public class Axe extends Weapon {
    double sharpness = 1.0;
    final double MIN_SHARPNESS = 0.1;
    final double MAX_SHARPNESS = 0.8;
    public Axe(int attackPower) {
        super(attackPower);
    }

    public double doDamage(){
        sharpness -= -0.02;
        if(sharpness > MIN_SHARPNESS){
           sharpness = MIN_SHARPNESS;
        }
        return super.doDamage() * sharpness;
    }
}
