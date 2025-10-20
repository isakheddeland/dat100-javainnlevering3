package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;

public class Customers {

    private Customer[] customers;

    // a) Complete constructor
    public Customers(int size) {

        this.customers = new Customer[size];

    }

    // b) count number of non-null references
    public int countNonNull() {


        int count = 0;

        for (Customer customer : customers){
            if (customer.getCustomer_id() != 0){
                count++;
            }
        }

        return count;
    }

    // c) return reference to customer with given id (if exists)
    public Customer getCustomer(int customer_id) {

        boolean funnet = false;
        Customer c = null;

        for (Customer customer : customers){
            if (customer.getCustomer_id() == customer_id){
                funnet = true;
                c = customer;
                break;
            }
        }

        if(funnet){
            return c;
        }else{
            return null;
        }

    }

    // d) add a customer to the reference table
    public boolean addCustomer(Customer c) {

        boolean inserted = false;
        int i = 0;

        while (i < customers.length && !inserted){
            if (customers[i] == null){
                customers[i] = c;
                inserted = true;
            }else{
                i++;
            }
        }

        return inserted;
    }

    // e) remove customer with given id from reference table
    public Customer removeCustomer(int customer_id) {

        boolean deleted = false;
        Customer c = null;

        for (int i = 0; i < customers.length; i++){
            Customer customer = customers[i];

            if (customer != null && customer.getCustomer_id() == customer_id){
                c = customer;
                customers[i] = null;
                break;
            }
        }

        return c;
    }

    // f) return reference table with all customers
    public Customer[] getCustomers() {

        Customer[] customers = null;
        int count = 0;

        for (Customer customer : customers){
            if (customer != null){
                count++;
            }
        }
        return customers;
    }


}