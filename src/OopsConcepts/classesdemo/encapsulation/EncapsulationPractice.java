package OopsConcepts.classesdemo.encapsulation;

class ATM {

    private int pin;
    private double balance;

    public void setPin(int pin) {
        this.pin = pin;
        System.out.println("Pin set successfully");
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount");
        } else {
            balance = balance + amount;
            System.out.println("Deposited: " + amount);
        }
    }

    public void withdraw(double amount, int enteredPin) {
        if (enteredPin == this.pin) {
            if (amount <= 0) {
                System.out.println("Invalid amount");
            } else if (amount > balance) {
                System.out.println("Insufficient balance");
            } else {
                balance = balance - amount;
                System.out.println("Withdrawal successful! Remaining balance: " + balance);
            }
        } else {
            System.out.println("Incorrect PIN");
        }
    }

    public void checkBalance(int enteredPin) {
        if (enteredPin == this.pin) {
            System.out.println("Your balance is: " + balance);
        } else {
            System.out.println("Incorrect PIN");
        }
    }
}

public class EncapsulationPractice {
    public static void main(String[] args) {

        ATM atm = new ATM();

        atm.setPin(5872);
        atm.deposit(1000);
        atm.withdraw(2000, 5872);  // should show Insufficient balance
        atm.checkBalance(5872);    // should show 1000
    }
}
