package wsb.po.banking.domain;

import java.util.ArrayList;

public class Bank {

    private ArrayList<Customer> customers = new ArrayList<Customer>();
    public Bank() {
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
