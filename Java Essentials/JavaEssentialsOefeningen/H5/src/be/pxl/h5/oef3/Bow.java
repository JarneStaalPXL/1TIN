package be.pxl.h5.oef3;

public class Bow extends Weapon {
    int numArrows;

    Bow(int attackPower) {
        super(attackPower);
    }

    public double doDamage(){
        if(numArrows > 0){
            numArrows--;
            return super.doDamage();
        }
        System.out.println("Out of arrows!");
        numArrows = 0;
        return numArrows;
    }

    public int getNumArrows(){
        return numArrows;
    }

    public void addArrows(int numArrowsFound){
        numArrows += numArrowsFound;
    }
}
