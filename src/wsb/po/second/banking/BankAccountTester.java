package wsb.po.second.banking;

public class BankAccountTester {
    /**
     * Tests the methods of the BankAccount class.
     *
     * @param args not used
     */
    public static void main(String[] args) {
        BankAccount harrysChecking = new BankAccount();
        harrysChecking.deposit(2000);
        harrysChecking.withdraw(500);
        System.out.println(harrysChecking.getBalance());
        System.out.println("Expected: 1500");

        BankAccount inneKonto = new BankAccount(2000);
        inneKonto.withdraw(500);
        System.out.println(inneKonto.getBalance());

        System.out.println(harrysChecking == inneKonto);
        System.out.println(harrysChecking.equals(inneKonto));

        System.out.println(harrysChecking.toString());
    }


}
