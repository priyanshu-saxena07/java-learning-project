package loops;

import java.util.Scanner;

public class LearnLoops {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.println("--- Positive Number Collector ---");
        System.out.println("Enter numbers (Enter a negative number to stop):");

        do {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();

            if (number >= 0) {
                System.out.println("You entered: " + number);
            }

        } while (number >= 0);

        System.out.println("Negative number detected. Program stopped! ");
        scanner.close();

        }

    }



