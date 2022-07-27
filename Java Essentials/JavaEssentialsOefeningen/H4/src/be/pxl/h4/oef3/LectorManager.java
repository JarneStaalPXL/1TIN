package be.pxl.h4.oef3;

import java.util.ArrayList;
import java.util.List;

public class LectorManager {
    public static void main(String[] args){
        Lector daemsGreta = new Lector();
        daemsGreta.setVoorNaam("Daems");
        daemsGreta.setAchterNaam("Greta");
        daemsGreta.setAanstellingsPercentage(70);
        Vak javaEssentials = new Vak();
        javaEssentials.setNaam("Java Essentials");
        javaEssentials.setCode("41TIN1130");
        javaEssentials.setAantalStudiepunten(6);

        Vak itEssentials = new Vak();
        itEssentials.setNaam("IT Essentials");
        itEssentials.setCode("41TIN1300");
        itEssentials.setAantalStudiepunten(6);

        Vak netAdvanced = new Vak();
        netAdvanced.setNaam(".Net Advanced");
        netAdvanced.setCode("42TIN1220");
        netAdvanced.setAantalStudiepunten(3);

        Vak javaAdvanced = new Vak();
        javaAdvanced.setNaam("Java Advanced");
        javaAdvanced.setCode("42TIN1230");
        javaAdvanced.setAantalStudiepunten(3);

        Vak programmingExpert = new Vak();
        programmingExpert.setNaam("Programming Expert");
        programmingExpert.setCode("43AON3120");
        programmingExpert.setAantalStudiepunten(3);

        daemsGreta.vakkenToevoegen(List.of(javaEssentials, itEssentials, netAdvanced, javaAdvanced, programmingExpert));
        System.out.println(daemsGreta);
    }
}
