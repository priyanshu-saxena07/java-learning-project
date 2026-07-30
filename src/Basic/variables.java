package Basic;

import java.util.Scanner;

public class variables {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = scanner.nextInt(); // Value is now dynamic

        if (x > 20) {
            if (x < 25) {
                System.out.println("Correct");
            } else {
                System.out.println("Incorrect");
            }
        }
        System.out.println(x);
        scanner.close();


    }
}


