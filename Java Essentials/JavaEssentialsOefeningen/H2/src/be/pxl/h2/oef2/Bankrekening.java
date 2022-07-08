package be.pxl.h2.oef2;

import java.text.DecimalFormat;

public class Bankrekening {
    public String rekeningnummer;
    public String naamEigenaar;
    public double saldo;
    public double rentePercentage;
    public DecimalFormat df = new DecimalFormat("0.00");

    public Bankrekening(String rekeningnummer, String naamEigenaar, double saldo, double rentePercentage) {
        if(rekeningnummer.equals("")){
           rekeningnummer = "geen";
        }
        if(naamEigenaar.equals("")){
            naamEigenaar = "onbekend";
        }
        if(saldo < 0){
            saldo = 0;
        }
        if(rentePercentage <= 0){
            rentePercentage = 1.2;
        }
        this.rekeningnummer = rekeningnummer;
        this.naamEigenaar = naamEigenaar;
        this.saldo = saldo;
        this.rentePercentage = rentePercentage;
        System.out.println("Bankrekening geopend met saldo "+df.format(saldo)+" euro");
        print();
    }

    public void setNaam(String naam){
        this.naamEigenaar = naam;
    }

    public void setRekeningNummer(String reknmr){
        this.rekeningnummer = reknmr;
    }

    public double getSaldo(){
        return saldo;
    }

    public void stort(double bedrag){
        if(valideerRekening()){
            if(bedrag < 0){
                bedrag = 0;
            }
            saldo += bedrag;
        }
    }

    public void neemOp(double bedrag){
        if(valideerRekening()){
            if(saldo == 0) System.out.println("U kan geen geld opnemen.");

            if(bedrag > saldo){
                saldo -= saldo;
                System.out.println("U mag enkel " + saldo + " euro opnemen");
            }
            else saldo = saldo - Math.abs(bedrag);
        }
    }

    public void doeVerrichting(double[] bedragen){
        if(valideerRekening()){
            for(double bedrag : bedragen){
                if(bedrag <= 0){
                    neemOp(bedrag);
                    System.out.println("> Na opname van " + df.format(Math.abs(bedrag)) + " euro");
                    print();
                }
                else {
                    stort(bedrag);
                    System.out.println("> Na storting van " + df.format(Math.abs(bedrag)) + " euro");
                    print();
                }
            }
        }
    }

    public void schrijfRenteBij(){
        if(valideerRekening()){
            var saldoInclusiefRente = (saldo * rentePercentage)/100;
              saldo += saldoInclusiefRente;

            System.out.println("> Rente wordt bijgeschreven voor "+df.format(saldoInclusiefRente)+" euro");
            print();
        }
    }

    public boolean valideerRekening(){
        boolean validated = !rekeningnummer.equals("geen") && !naamEigenaar.equals("onbekend");
        if(!validated) System.out.println("\nRekeningnummer en/of naam eigenaar is niet geldig!!");
        return validated;
    }

    public void print(){
        System.out.println("Saldo op spaarrekeing "+rekeningnummer+" op naam van "+naamEigenaar+" bedraagt "+df.format(saldo)+" euro.");
    }
}
