package be.pxl.h1.oef8;

import java.util.Scanner;

public class Oefening8 {
    public static void main(String[] args){
        Lift lift = new Lift();
        lift.setAantalToegelatenPersonen(5);
        lift.setAantalVerdiepingen(10);

        Scanner in = new Scanner(System.in);

        int keuzenummer = 0;

        do {
            System.out.println("1. Ga naar verdieping ...");
            System.out.println("2. Betreed de lift ...");
            System.out.println("3. Verlaat de lift ...");
            System.out.println("4. Stoppen");
            keuzenummer = in.nextInt();

            switch (keuzenummer){
                case 1:
                    System.out.println("Welke verdieping?");
                    int verdieping = in.nextInt();
                    lift.gaNaar(verdieping);
                    break;
                case 2:
                    System.out.println("Hoeveel personen?");
                    int personen = in.nextInt();
                    lift.betreed(personen);
                    break;
                case 3:
                    System.out.println("Hoeveel personen?");
                    personen = in.nextInt();
                    lift.verlaat(personen);
                    break;
                case 4:
                    System.out.println("Einde");
                    break;
                default:
                    System.out.println("Ongeldige keuze");
            }
        }
        while(keuzenummer != 4);
    }
}
