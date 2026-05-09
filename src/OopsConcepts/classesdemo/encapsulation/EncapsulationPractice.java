package OopsConcepts.classesdemo.encapsulation;

class ATM {

    private int pin;
    private double balance;

    private int wrongAttempts = 0;
    private boolean isBlocked = false;



    public void setPin(int oldPin, int newPin) {
        if (isBlocked) {
            System.out.println("Account is blocked");
            return;
        }


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
        if (isBlocked) {
            System.out.println("Account is blocked");
            return;
        }


        if (amount <= 0) {
            System.out.println("Invalid amount");
        } else {
             balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    public void withdraw(double amount, int enteredPin) {
        if (isBlocked) {
            System.out.println("Account is blocked");
            return;
        }

         if (enteredPin != pin) {
             wrongAttempts++;
             System.out.println("Incorrect PIN");

             if (wrongAttempts >= 3) {
                 isBlocked = true;
                 System.out.println("Account blocked after 3 wrong attempts");
             }
             return;
         }

         wrongAttempts = 0;
         double totalAmount = amount + 10;

         if (amount <= 0) {
             System.out.println("Invalid amount");
         } else if ( totalAmount > balance) {
             System.out.println("Insufficient balance");
         } else {
             balance -= totalAmount;

             System.out.println("Withdrawal successful! Remaining balance: " +  balance);
             System.out.println("Withdrawal successful: " + amount);
             System.out.println("charges 10");
             System.out.println("Remaining balance: " + balance);
         }
    }


    public void checkBalance(int enteredPin) {

        if (isBlocked) {
            System.out.println("Account is blocked");
            return;
        }


        if (enteredPin != pin) {

         wrongAttempts++;

            System.out.println("Incorrect PIN");

            if (wrongAttempts >= 3) {
                isBlocked = true;
                System.out.println("Account blocked after 3 wrong attempts");
            }
        } else {
            wrongAttempts = 0;
            System.out.println("Your balance is " + balance);
        }
    }
}

public class EncapsulationPractice {
    public static void main(String[] args) {

        ATM atm = new ATM();

        atm.setPin(0, 4571);
        atm.deposit(10000);
        atm.withdraw(500,4571);
        atm.checkBalance(4571);


    }
}
