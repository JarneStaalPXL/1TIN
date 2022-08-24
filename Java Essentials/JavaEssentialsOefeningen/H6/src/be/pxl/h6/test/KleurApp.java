package be.pxl.h6.test;

public class KleurApp {
    public enum Dag{MAANDAG, DINSDAG, WOENSDAG, DONDERDAG, VRIJDAG, ZATERDAG, ZONDAG}

    public static void main(String[] args) {
        for(Dag d : Dag.values()){
            System.out.println(d + " op positie " + d.ordinal() + " is een "+ isWeekend(d));
        }

        var someDay = Dag.ZONDAG;
        var someOtherDay = Dag.ZATERDAG;
        //check what day comes first
        if(someDay.ordinal() < someOtherDay.ordinal()) {
            System.out.println(someDay + " komt eerst voor");
        }
    }

    //method that checks if the day is a weekday
    public static String isWeekend(Dag d){
        if(d.ordinal()> 4){
            return "Weekend";
        }
        else return "Weekdag";
    }
}
