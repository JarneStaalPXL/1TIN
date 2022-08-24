package be.pxl.h5.oef3;

public class Sword extends Weapon {
    double sharpness = 1.0;
    final double MIN_SHARPNESS = 0.2;
    final double MAX_SHARPNESS = 1.0;
    public Sword(int attackPower) {
        super(attackPower);
    }

    public double doDamage(){
        sharpness -= -0.1;
        if(sharpness > MIN_SHARPNESS){
            sharpness = MIN_SHARPNESS;
        }
        return super.doDamage() * sharpness;
    }
}
