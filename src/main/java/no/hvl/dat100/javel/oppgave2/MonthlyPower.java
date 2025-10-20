package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DailyPower;

public class MonthlyPower {

    // a) print power usage for a month
    public static void print_PowerUsage(double[][] usage) {

        for (int i = 0; i < usage.length; i++){
            for (int k = 0; k < usage[i].length; k++){
                System.out.print(usage[i][k] + " kr/kWh");
            }

        }

    }

    // b) print power prices for a month
    public static void print_PowerPrices(double[][] prices) {

        for (int i = 0; i < prices.length; i++){
            for (int k = 0; k < prices[i].length; k++){
                System.out.print(prices[i][k] + " NOK");
            }

        }

    }

    // c) compute total power usage for a month
    public static double computePowerUsage(double[][] usage) {

        double sum = 0;

        for (int i = 0; i < usage.length; i++){
            for (int k = 0; k < usage[i].length; k++){
                sum += usage[i][k];
            }

        }

        return sum;
    }

    // d) determine whether a given threshold in powerusage for the month has been exceeded
    public static boolean exceedThreshold(double[][] powerusage, double threshold) {

        boolean exceeded = false;
        double usage = 0;

        int i = 0;
        int k = 0;

        while (!exceeded && i < powerusage.length){

            usage += powerusage[i][k];

            if (usage > threshold){
                exceeded = true;
            }else{
                k++;
                if(k == powerusage[i].length){
                    k=0;
                    i++;
                }
            }

        }


        return exceeded;
    }

    // e) compute spot price
    public static double computeSpotPrice(double[][] usage, double[][] prices) {

        double price = 0;

        for (int i = 0; i < usage.length; i++){
            for (int k = 0; k < usage[i].length; k++){
                price += usage[i][k] * prices[i][k];
            }

        }


        return price;
    }

    private static final double THRESHOLD = 0.9375;
    private static final double PERCENTAGE = 0.9;
    // f) power support for the month
    public static double computePowerSupport(double[][] usage, double[][] prices) {

        double support = 0;

        for (int i = 0; i < usage.length; i++){
            for (int k = 0; k < usage[i].length; k++){
                double price = usage[i][k] * prices[i][k];

                if (price > THRESHOLD){
                    support += (price - THRESHOLD) * PERCENTAGE * usage[i][k];
                }

            }

        }

        return support;
    }

    private static final double NORGESPRIS_KWH = 0.5;
    // g) Norgesprice for the month
    public static double computeNorgesPrice(double[][] usage) {

        double price = 0;

        for (int i = 0; i < usage.length; i++) {
            for (int k = 0; k < usage[i].length; k++) {
                price = NORGESPRIS_KWH + usage[i][k];
            }
        }
        return price;
    }
}
