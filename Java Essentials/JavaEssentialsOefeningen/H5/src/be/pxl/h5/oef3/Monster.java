package be.pxl.h5.oef3;

public class Monster extends Character {
    double attackPower;

    public Monster(String name, double health) {
        super(name, health);
    }

    public void attack(Character opponent){
        opponent.health -= attackPower;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "attackPower=" + attackPower +
                ", name='" + name + '\'' +
                ", health=" + health +
                '}';
    }
}
