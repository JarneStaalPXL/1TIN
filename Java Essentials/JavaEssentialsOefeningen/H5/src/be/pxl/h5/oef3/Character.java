package be.pxl.h5.oef3;

public class Character {
    String name;
    double health;

    public Character(String name, double health) {
        this.name = name;
        this.health = health;
    }

    public double getHealth() {
        return health;
    }

    public boolean alive(){
        return health > 0;
    }

    public void attack(Character opponent){
        opponent.health -= 10;
    }

    public void speak(String text){
        System.out.println(name + " : " + text);
    }

    public double decreaseHealth(double damage){
        health -= damage;
        if(health < 0){
            health = 0;
            System.out.println(name + " is dead");
        }
        return health;
    }

    public double heal(double additionalHealth){
        health += additionalHealth;
        if(health >= 100){
            health = 100;
            System.out.println("Feeling great!");
        }
        return health;
    }


}
