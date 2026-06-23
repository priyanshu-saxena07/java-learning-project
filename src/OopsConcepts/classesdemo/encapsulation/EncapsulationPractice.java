package OopsConcepts.classesdemo.encapsulation;

class ATM {
    private int pin;
    private double balance;
    private int wrongAttempts = 0;
    private boolean isBlocked = false;
    private boolean isPinSet = false; // Check for setting PIN the first time

    // Set or change PIN
    public void setPin(int oldPin, int newPin) {
        if (isBlocked) {
            System.out.println("Account is blocked!");
            return;
        }

        if (newPin < 1000 || newPin > 9999) {
            System.out.println("PIN must be exactly 4 digits.");
            return;
        }

        // True if first time setting OR if the old PIN matches
        if (!isPinSet || this.pin == oldPin) {
            this.pin = newPin;
            this.isPinSet = true;
            this.wrongAttempts = 0; // Reset attempts on success
            System.out.println("PIN set/updated successfully.");
        } else {
            handleWrongAttempt();
            System.out.println("Incorrect old PIN.");
        }
    }

    // Deposit money
    public void deposit(double amount) {
        if (isBlocked) {
            System.out.println("Account is blocked!");
            return;
        }

        if (amount <= 0) {
            System.out.println("Invalid amount.");
        } else {
            balance += amount;
            System.out.println("Deposited: " + amount + " | Current Balance: " + balance);
        }
    }


    public void withdraw(double amount, int enteredPin) {
        if (isBlocked) {
            System.out.println("Account is blocked!");
            return;
        }

        if (enteredPin != pin) {
            System.out.println("Incorrect PIN.");
            handleWrongAttempt();
            return;
        }

        wrongAttempts = 0;

        if (amount <= 0) {
            System.out.println("Invalid amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful: Rs. " + amount);
            System.out.println("Remaining balance: Rs. " + balance);
        }
    }

    // Check account balance
    public void checkBalance(int enteredPin) {
        if (isBlocked) {
            System.out.println("Account is blocked!");
            return;
        }

        if (enteredPin != pin) {
            System.out.println("Incorrect PIN.");
            handleWrongAttempt();
        } else {
            wrongAttempts = 0;
            System.out.println("Your balance is: Rs. " + balance);
        }
    }

    // Common method to handle wrong PIN attempts
    private void handleWrongAttempt() {
        wrongAttempts++;
        if (wrongAttempts >= 3) {

            isBlocked = true;
            System.out.println("Account BLOCKED due to 3 wrong attempts!");
        }
    }
}

public class EncapsulationPractice  {
    public static void main(String[] args) {
        ATM atm = new ATM();

        // Testing the code safely
        atm.setPin(0, 4571);
        atm.deposit(10000);
        atm.withdraw(500, 4571);
        atm.checkBalance(4571);
        atm.withdraw(2600, 4571);

        atm.withdraw(2000,4587);
        atm.withdraw(2000,4571);


    }
}
