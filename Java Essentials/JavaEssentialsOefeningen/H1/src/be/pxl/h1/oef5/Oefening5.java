package be.pxl.h1.oef5;

import java.util.ArrayList;
import java.util.List;

public class Oefening5 {
    public static void main(String[] args) {
        Spaceship ship1 = new Spaceship("Adromeda", 0, false);
        Spaceship ship2 = new Spaceship("Fungos", 0, true);
        List<Spaceship> battleList = new ArrayList<>(List.of(ship1, ship2));

        for (int i = 0; i < 3; i++) {
            ship1.fire(ship2);
        }

        checkIfDeadAndReport(battleList);

        ship2.setShieldOn(true);
        for (int i = 0; i < 3; i++) {
            ship1.fire(ship2);
        }

        checkIfDeadAndReport(battleList);
    }

    public static void checkIfDeadAndReport(List<Spaceship> battleList){
        battleList.removeIf(Spaceship::isDestroyed);
        System.out.println("\nRemaining battleships:");
        for(Spaceship spaceship : battleList){
            System.out.println(spaceship.name);
        }
        System.out.println("--------------------------------\n\n");
    }
}
