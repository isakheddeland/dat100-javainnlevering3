package no.hvl.dat100.javel.oppgave1;

import no.hvl.dat100.javel.oppgave2.MonthlyPower;
import org.w3c.dom.ls.LSOutput;

public class DayMain {

    public static void main(String[] args) {

        // test data
        double[] powerusage_day = DayPowerData.powerusage_day;

        double[] powerprices_day = DayPowerData.powerprices_day;

        System.out.println("==============");
        System.out.println("OPPGAVE 1");
        System.out.println("==============");
        System.out.println();


        System.out.println("Strømforbruk: ");
        DailyPower.printPowerPrices(powerusage_day);
        System.out.println();
        System.out.println();

        System.out.println("Strømpriser: ");
        DailyPower.printPowerUsage(powerprices_day);
        System.out.println();
        System.out.println();

        DailyPower.computePowerUsage(powerusage_day);
        System.out.println();
        System.out.println();

        DailyPower.computeSpotPrice(powerusage_day, powerprices_day);
        System.out.println();
        System.out.println();


        double totalSupport = DailyPower.computePowerSupport(powerusage_day, powerprices_day);
        System.out.println("Totalpris etter støtte: " + totalSupport + "kr");
        System.out.println();

        double norgesPris = DailyPower.computeNorgesPrice(powerusage_day);
        System.out.println("Norgespris: " + norgesPris + "kr/kWh");
        System.out.println();

        double maksVerdi = DailyPower.findPeakUsage(powerprices_day);
        System.out.println("Største strømforbruket: " + maksVerdi + "kr");
        System.out.println();

        double gjennomsnitt = DailyPower.findAvgPower(powerprices_day);
        System.out.println("Gjennomsnitt pris: " + gjennomsnitt + "kr");

    }
}
