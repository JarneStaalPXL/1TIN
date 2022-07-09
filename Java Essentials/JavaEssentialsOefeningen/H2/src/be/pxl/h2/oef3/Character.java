package be.pxl.h2.oef3;

public class Character {
    public static int count;
    public final int MAX_TITLES = 3;
    public String firstName;
    public String lastName;
    public String nickName;
    public String house;
    public int firstSeason;
    public int lastSeason;
    public int episodes;
    public String portrayedBy;
    public int numberOfTitles = 0;
    public String[] titles = new String[MAX_TITLES];


    public Character(String firstName, String lastName, String house, String portrayedBy) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.house = house;
        this.portrayedBy = portrayedBy;
        count++;
    }

    public Character(String firstName, String lastName, String nickName, String house, String portrayedBy) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.house = house;
        this.portrayedBy = portrayedBy;
        this.nickName = nickName;
        count++;
    }

    public Character(String firstName, String lastName, String nickName, String house, int firstSeason, int lastSeason, int episodes, String portrayedBy) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.house = house;
        this.firstSeason = firstSeason;
        this.lastSeason = lastSeason;
        this.episodes = episodes;
        this.portrayedBy = portrayedBy;
        this.nickName = nickName;
        count++;
    }

    public void setData(int firstSeason, int lastSeason, int episodes) {
        this.firstSeason = firstSeason;
        this.lastSeason = lastSeason;
        this.episodes = episodes;
    }

    public void addTitle(String title) {
        if (!containsTitle(title)) {
            if(titles[MAX_TITLES-1] != null) {
                throw new IllegalArgumentException("No more titles allowed than 3");
            }
            else {
                titles[numberOfTitles] = title;
                numberOfTitles++;
            }
        }
    }

    public boolean containsTitle(String title) {
        for (int i = 0; i < numberOfTitles; i++) {
            if (titles[i].equals(title)) {
                return true;
            }
        }
        return false;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numberOfTitles; i++) {
            sb.append("*** \"").append(titles[i]).append("\"\n");
        }
        return "\n\n\"" + nickName + "\" of house " + house + "\n" +
                sb +
                "Played by: " + firstName + " " + lastName + " in season " + firstSeason + "-" + lastSeason + " (" + episodes + " episodes)";
    }
}
