package be.pxl.h4.oef1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Band {
    public String naam;
    public ArrayList<Muzikant> leden;

    public Band(String naam, ArrayList<Muzikant> leden){
        this.naam = naam;
        this.leden = leden;
    }

    public void speel(int lengte){
        while (lengte > 0){
            int index = ThreadLocalRandom.current().nextInt(0, leden.size());
            leden.get(index).speel();
            lengte--;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PXL-Digital\n");
        for(Muzikant m : leden){
            sb.append(m.toString()).append("\n");
        }
        return sb.toString();
    }
}
