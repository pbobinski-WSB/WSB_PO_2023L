package wsb.po.banking.domain;

import java.util.ArrayList;

public class Bank {

    private ArrayList<Customer> customers = new ArrayList<Customer>();

    /*
    Potrzebny Singleton - tylko jeden Bank
     */
    private static Bank bankInstance = null;

    public static Bank getBank() {
        if (bankInstance == null) {
            bankInstance = new Bank();
        }
        return bankInstance;
    }

    private Bank() {
    }

    public void addCustomer(String f, String l) {
        Customer customer = new Customer(f,l);
        customers.add(customer);
    }
   public int getNumberOfCustomers() {
        return customers.size();
    }

   public Customer getCustomer(int i) {
        if (i >= getNumberOfCustomers()) {
            return null;
        }
        return customers.get(i);
    }
}
