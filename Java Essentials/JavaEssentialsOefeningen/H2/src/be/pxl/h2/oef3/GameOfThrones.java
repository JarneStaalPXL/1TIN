package be.pxl.h2.oef3;

public class GameOfThrones {
    public static void main(String[] args) {
        Character character = new Character("Jon", "Snow", "Snow", "Stark", 1, 10, 18, "Daenerys");
        character.addTitle("The King in the North");
        character.addTitle("The Night King");
        character.addTitle("The Lion and the Witch");
        System.out.println(character.toString());

        Character character2 = new Character("Daenerys", "Targaryen", "Targaryen", "Targaryen", 1, 10, 18, "Daenerys");
        character2.addTitle("The Last Dragon");
        character2.addTitle("The Dragon and the Wolf");
        character2.addTitle("The Dragon and the Lion");
        System.out.println(character2.toString());

        Character character3 = new Character("Tyrion", "Lannister", "Tyrion", "Lannister", 1, 10, 18, "Tyrion");
        character3.addTitle("The Imp");
        character3.addTitle("The Imp and the Dragon");
        character3.addTitle("The Imp and the Lion");
        System.out.println(character3.toString());

        System.out.println("\n"+character.getCount() + " characters registered");
    }
}
