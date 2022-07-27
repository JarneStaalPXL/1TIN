package be.pxl.h4.oef4;

public class Gemeente {
    private int postcode;
    private String gemeenteNaam;

    public Gemeente(int postcode, String gemeenteNaam) {
        setPostcode(postcode);
        setGemeenteNaam(gemeenteNaam);
    }

    public int getPostcode() {
        return postcode;
    }

    public void setPostcode(int postcode) {
        int postcodeLn = Integer.toString(postcode).length();

        if (postcodeLn > 4) {
            this.postcode = Integer.parseInt(Integer.toString(postcode).substring(0, 4));
        } else if (postcodeLn == 4) {
            this.postcode = postcode;
        } else  {
            StringBuilder pc = new StringBuilder(Integer.toString(postcode));
            while (pc.length() < 4) {
                pc.append("0");
            }
            this.postcode = Integer.parseInt(pc.toString());
        }
    }

    public String getGemeenteNaam() {
        return gemeenteNaam;
    }

    public void setGemeenteNaam(String gemeenteNaam) {
        this.gemeenteNaam = gemeenteNaam;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getPostcode()).append(" ");
        sb.append(cleanUpGemeente(getGemeenteNaam()));
        return sb.toString();
    }

    private String cleanUpGemeente(String gemeenteNaam) {
        String gemeente = removeNumbersFromString(gemeenteNaam);
        gemeente = letterAfterSymbolAndSpaceAdjustment(gemeente);
        gemeente = firstLetterToUpperCase(gemeente);
        return gemeente;
    }

    private String letterAfterSymbolAndSpaceAdjustment(String gemeenteZonderNummers) {
        StringBuilder sb = new StringBuilder(gemeenteZonderNummers);
        //Set all chars to lowercase except when they are after a space or a symbol
        for (int i = 0; i < sb.length(); i++) {
            //check if char before is a space or a symbol
            if (i > 0 && (sb.charAt(i - 1) != '-') && (sb.charAt(i - 1) != ' ') && (sb.charAt(i - 1) != '*') && (sb.charAt(i - 1) != '"') && (sb.charAt(i - 1) != ',')) {
                sb.setCharAt(i, Character.toLowerCase(sb.charAt(i)));
            }
        }
        return sb.toString();
    }

    private String firstLetterToUpperCase(String s) {
        return Character.toUpperCase(s.charAt(0)) + s.substring(1);
    }

    public String removeNumbersFromString(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
