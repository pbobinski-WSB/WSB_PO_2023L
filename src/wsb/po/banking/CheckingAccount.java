package wsb.po.banking;

public class CheckingAccount extends BankAccount {

    private double overdraftProtection = 0;

    public CheckingAccount(double balance) {
        super(balance);
    }

    public CheckingAccount(double balance, double overdraftProtection) {
        super(balance);
        this.overdraftProtection = overdraftProtection;
    }

    @Override
    public void withdraw(double amount) throws OverdraftException{
        if (amount > getBalance() + overdraftProtection) {
            throw new OverdraftException("przekroczono saldo i limit",amount - (getBalance() + overdraftProtection));
        }
        if (amount > getBalance()) {
            //użyć limitu
            double ileBrakuje = amount - getBalance();
            overdraftProtection -= ileBrakuje;
            super.withdraw(getBalance());
        } else {
            super.withdraw(amount);
        }

    }

    @Override
    public String toString() {
        return super.toString() +
                " CheckingAccount{" +
                "overdraftProtection=" + overdraftProtection +
                '}';
    }
}
