package no.hvl.dat100.javel.oppgave2;

import java.time.Month;

public class MonthMain {
    public static void main(String[] args) {

        // test data
        double[][] power_prices_month = MonthPowerData.powerprices_month;

        double[][] power_usage_month = MonthPowerData.powerusage_month;

        System.out.println("==============");
        System.out.println("OPPGAVE 2");
        System.out.println("==============");
        System.out.println();

        MonthlyPower.print_PowerUsage(power_usage_month);
        System.out.println();
        System.out.println();

        MonthlyPower.print_PowerPrices(power_prices_month);
        System.out.println();
        System.out.println();


        double totalUsage = MonthlyPower.computePowerUsage(power_usage_month);
        System.out.println("Total månedlig strømforbruk: " + totalUsage + "kWh");
        System.out.println();

        boolean overHytte = MonthlyPower.exceedThreshold(power_usage_month, 1000);
        boolean overBolig = MonthlyPower.exceedThreshold(power_usage_month, 5000);
        System.out.println(overHytte);
        System.out.println(overBolig);
        System.out.println();

        double spotPris = MonthlyPower.computeSpotPrice(power_usage_month, power_prices_month);
        System.out.println(spotPris);
        System.out.println();

        double norgesPris = MonthlyPower.computeNorgesPrice(power_usage_month);
        System.out.println("Norges pris: " + norgesPris + "kr/kWh");


    }
}