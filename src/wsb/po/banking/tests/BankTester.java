package wsb.po.banking.tests;

import wsb.po.banking.domain.*;
import wsb.po.banking.reports.CustomerReport;

public class BankTester {



    public static void main(String[] args) {

        //Bank bank = new Bank();
        Bank bank = Bank.getBank();

        bank.addCustomer("Simms", "Jane");
        bank.addCustomer("Bryant", "Owen");

        BankAccount account = new SavingsAccount(500, 2);
        bank.getCustomer(0).addAccount(account);
        account = new CheckingAccount(200);
        bank.getCustomer(0).addAccount(account);
        account = new SavingsAccount(200, 5);
        bank.getCustomer(1).addAccount(account);
        account = new CheckingAccount(1500);
        bank.getCustomer(1).addAccount(account);
        account = new SavingsAccount(200, 10);
        bank.getCustomer(1).addAccount(account);

        CustomerReport customerReport = new CustomerReport();
        customerReport.generateRepotr();


    }

}
