package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;
import no.hvl.dat100.javel.oppgave2.MonthPowerData;

import java.time.Month;

public class InvoiceMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 5");
        System.out.println("==============");
        System.out.println();

        Customer c1 = new Customer("Alice Smith","alice@example.com", 1001, PowerAgreementType.SPOTPRICE);
        Customer c2 = new Customer("Bob Johnson","bob@example.com", 1002, PowerAgreementType.NORGESPRICE);
        Customer c3 = new Customer("Charlie Rose","charlie@example.com", 1003, PowerAgreementType.POWERSUPPORT);
        Customer c4 = new Customer("Diana Prince","diana@example.com", 1004, PowerAgreementType.NORGESPRICE);
        Customer c5 = new Customer("Ethan Hunt","ethan@example.com", 1005, PowerAgreementType.POWERSUPPORT);

      Customer[] customers = {c1, c2, c3, c4, c5};

      Invoice[] invoices = new Invoice[customers.length];

      for (int i = 0; i < customers.length; i++){
          invoices[i] = new Invoice(customers[i], "January", MonthPowerData.powerusage_month, MonthPowerData.powerprices_month);
      }

        Invoices.processInvoices(invoices);

    }
}
