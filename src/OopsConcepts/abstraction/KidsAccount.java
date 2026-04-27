package OopsConcepts.abstraction;

public class KidsAccount extends BankAccount{
    public KidsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        System.out.println();
    }

    @Override
    public void withdraw(double amount) {

    }
}
