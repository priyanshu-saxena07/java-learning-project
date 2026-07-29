package methods;

public class MethodPractice {
    public static void main(String[] args) {
        // The main method: execution starts here
            // Calling a void method
            greetUser("Alex");

            // Calling a return method and storing its value
            int finalScore = calculateTotal(80, 15);
            System.out.println("Total Score: " + finalScore);
        }

        // Example 1: A method that performs an action but returns nothing (void)
        public static void greetUser(String name) {
            System.out.println("Hello, " + name + "! Welcome back.");
        }

        // Example 2: A method that processes data and returns an integer
        public static int calculateTotal(int baseScore, int bonusPoints) {
            return baseScore + bonusPoints;
    }
}