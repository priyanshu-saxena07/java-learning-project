package OopsConcepts.classesdemo.encapsulation;

class ATM {

    private int pin;
    private double balance;

    public void setPin(int oldPin, int newPin) {
        if (newPin < 1000 || newPin > 9999) {
            System.out.println("PIN must be exactly 4 digits");
            return;
        }
        // First time setting OR correct old PIN
        if (this.pin == 0 || this.pin == oldPin) {
            this.pin = newPin;
            System.out.println("PIN set/updated successfully ");
        } else {
            System.out.println("Incorrect old PIN");
        }
    }
    // Deposit money
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount");
        } else {
             balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    public void withdraw(double amount, int enteredPin) {
         if (enteredPin != pin) {
             System.out.println("Incorrect PIN");
                return;
        }

         if (amount <= 0) {
             System.out.println("Invalid amount");
         } else if (amount > balance) {
             System.out.println("Insufficient balance");
         } else {
             balance -= amount;
             System.out.println("Withdrawal successful! Remaining balance: " +  balance);
         }
    }


    public void checkBalance(int enteredPin) {
        if (enteredPin == pin) {
            System.out.println("Your balance is: " + balance);
        } else {
            System.out.println("Incorrect PIN");
        }
    }
}

public class EncapsulationPractice {
    public static void main(String[] args) {

        ATM atm = new ATM();

        atm.setPin(0, 4571);
        atm.deposit(1000);
        atm.withdraw(500,4571);
        atm.checkBalance(4571);

        atm.setPin(4571,7781);
        atm.checkBalance(7781);
    }
}
