package be.pxl.h1.oef8;

public class Lift {
    public int aantalVerdiepingen;
    public int huidigeVerdieping;
    public int aantalToegelatenPersonen;
    public int aantalPersonenInLift;

    public Lift() {

    }

    public void setAantalVerdiepingen(int aantalVerdiepingen) {
        this.aantalVerdiepingen = aantalVerdiepingen;
    }


    public void setHuidigeVerdieping(int huidigeVerdieping) {
        this.huidigeVerdieping = huidigeVerdieping;
    }

    public void setAantalToegelatenPersonen(int aantalToegelatenPersonen) {
        this.aantalToegelatenPersonen = aantalToegelatenPersonen;
    }


    public void betreed(int aantalPersonen) {
        var personen = aantalPersonenInLift + aantalPersonen;
        if (aantalToegelatenPersonen < personen) {
            throw new IllegalArgumentException("\n\nEr passen maar " + (aantalToegelatenPersonen - aantalPersonenInLift) + " personen in de lift " +
                    "en geen " + aantalPersonen + " personen.\n\n");
        } else {
            aantalPersonenInLift = personen;
            System.out.println("\nDe lift betreed.");
//            System.out.println("Er zijn nog "+ (aantalToegelatenPersonen - aantalPersonenInLift)+" plaatsen over");
        }
    }

    public void verlaat(int aantalPersonen) {
        if (aantalPersonen < 0) {
            //throw Exception
            throw new IllegalArgumentException("Aantal personen die de lift verlaten kan niet negatief zijn");
        }
        if (aantalPersonenInLift < aantalPersonen) {
            throw new IllegalArgumentException("Er kunnen nooit minder dan 0 personen in de lift staan");
        } else {
            aantalPersonenInLift = aantalPersonenInLift - aantalPersonen;
            System.out.println("\nDe lift verlaat.");
        }
    }

    public void gaNaar(int verdieping) {
        boolean kanVeranderenVanVerdieping = aantalVerdiepingen >= verdieping && verdieping >= 0;
        if (kanVeranderenVanVerdieping) {
            if (aantalPersonenInLift > 0 && aantalPersonenInLift <= aantalToegelatenPersonen) {
                System.out.println("Huidige verdieping: "+ huidigeVerdieping);
                System.out.println("Gekozen verdieping: " + verdieping);
                System.out.println("Is huidige verdieping kleiner of gelijk aan gekozen verdieping? " + (huidigeVerdieping <= verdieping));
                if (huidigeVerdieping <= verdieping) {
                    for (int i = huidigeVerdieping; i <= verdieping; i++) {
                        System.out.println("---\n" +
                                "|" + i + "|\n" +
                                "---");
                    }
                    setHuidigeVerdieping(verdieping);
                } else {
                    for (int i = huidigeVerdieping; i >= verdieping; i--) {
                        System.out.println("---\n" +
                                "|" + i + "|\n" +
                                "---");
                    }
                    setHuidigeVerdieping(verdieping);
                }
            } else {
                throw new IllegalArgumentException("Verdieping " + verdieping + " bestaat niet of geen personen in lift. De verdiepingen gaan van 0 tot en met 10");
            }
        }
    }
}
