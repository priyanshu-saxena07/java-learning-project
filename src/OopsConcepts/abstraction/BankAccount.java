package OopsConcepts.abstraction;

abstract public  class BankAccount {
    private String accountNumber;
    private double balance;

    public abstract void deposit(double amount);
    abstract void withdraw (double amount);
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;


    }
}
