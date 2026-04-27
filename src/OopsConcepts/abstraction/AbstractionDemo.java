package OopsConcepts.abstraction;

public class AbstractionDemo {
    public static void main(String[] args) {

        SavingsAccount savingsAccount= new SavingsAccount("Madhav45230679",100);
        savingsAccount.deposit(100);

         BankAccount savingsAccount1 = new SavingsAccount("Abhishak124525555",500);
         savingsAccount1 = new CurrentAccount("Arun1154972315", 700);
         savingsAccount1.deposit(500);






    }
}
