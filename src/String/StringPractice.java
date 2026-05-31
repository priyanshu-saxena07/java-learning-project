package String;

import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {

        String original = "LeetCode";


        Scanner scanner = new Scanner(System.in);
        System.out.print("Ek string enter karein: ");
        String user_input = scanner.nextLine();

        if (original.equalsIgnoreCase(user_input)) {
            System.out.println("Match ho gya");
        } else {
            System.out.println("Match nhi hua");
        }

        scanner.close();



    }
}

