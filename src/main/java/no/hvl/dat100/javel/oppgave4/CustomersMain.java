package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

public class CustomersMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 4");
        System.out.println("==============");
        System.out.println();

        Customers kundeliste = new Customers(5);

        Customer c1 = new Customer(" Alice Smith","alice@example.com", 1001, PowerAgreementType.SPOTPRICE);
        Customer c2 = new Customer("Bob Johnson","bob@example.com", 1002, PowerAgreementType.NORGESPRICE);
        Customer c3 = new Customer("Charlie Rose","charlie@example.com", 1003, PowerAgreementType.POWERSUPPORT);
        Customer c4 = new Customer("Diana Prince","diana@example.com", 1004, PowerAgreementType.NORGESPRICE);
        Customer c5 = new Customer("Ethan Hunt","ethan@example.com", 1005, PowerAgreementType.POWERSUPPORT);

        kundeliste.addCustomer(c1);
        kundeliste.addCustomer(c2);
        kundeliste.addCustomer(c3);
        kundeliste.addCustomer(c4);
        kundeliste.addCustomer(c5);

//        System.out.println(c1);
//        System.out.println(c2);

        Customer customerid1 = kundeliste.getCustomer(1004);
        System.out.println(customerid1);
        System.out.println();

        Customer removecust1 = kundeliste.removeCustomer(1010);
        System.out.println(removecust1);







    }
}
