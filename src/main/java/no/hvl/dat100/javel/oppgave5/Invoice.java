package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave2.MonthlyPower;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;
import java.util.Arrays;


public class Invoice {

    private Customer c; // customer associated with this invoice
    private String month; // month that the invoice covers
    private double[][] usage; // power usage this month (per day and per hour)
    private double[][] prices; // power prices for this month

    private double amount; // power price for this month


    public Invoice(Customer c, String month, double[][] usage, double[][] power_prices) {

        this.c = c;
        this.month = month;
        this.usage = usage;
        this.prices = power_prices;
        this.amount = 0;

    }

    public void computeAmount() {

        double total = 0;
        double totalUsage = 0;

        for (int i = 0; i < usage.length; i++) {
            for (int k = 0; k < usage[i].length; k++) {
                double pris = prices[i][k];
                double forbruk = usage[i][k];

                totalUsage += forbruk;

                switch (c.getAgreement()) {
                    case SPOTPRICE:
                        total += pris * forbruk;
                        break;

                    case POWERSUPPORT:
                        if (pris > 0.70) {
                            total += (0.70 + (pris - 0.70) * 10) * forbruk;
                        } else {
                            total += pris * forbruk;
                        }
                        break;

                    case NORGESPRICE:
                        if (totalUsage <= 5000) {
                            total += pris * forbruk;
                        }
                        break;
                }
            }

        }

        this.amount = total;
    }

    public void printInvoice() {
        System.out.println(c.toString());
        System.out.println("Month: " + month);

        double totalUsage = 0;
        for (int i = 0; i < usage.length; i++) {
            for (int j = 0; j < usage[i].length; j++) {
                totalUsage += usage[i][j];
            }
        }

        System.out.printf("Usage:      %.2f kWh%n", totalUsage);
        System.out.printf("Amount:    %.2f NOK%n", amount);
    }


}


