package Basic;

import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        System.out.println(age >= 18 ? "Welcome to bank" : "Try again when you turn 18");

        System.out.print("Enter marks: ");
        int marks = scanner.nextInt();
        String grade = (marks > 90) ? "Grade A+" :
                (marks > 80) ? "Grade A"  :
                        (marks > 75) ? "Grade B"  : "Grade F";
        System.out.println(grade);

        System.out.print("Enter day: ");
        String day = scanner.next();
        System.out.println(switch (day) {
            case "Monday" -> "Start of the Week";
            case "Tuesday", "Wednesday", "Thursday" -> "Working day";
            case "Friday" -> "Enjoy your Weekend";
            case "Saturday", "Sunday" -> "Weekend / Aram karo";
            default -> "Invalid day";
        });

        scanner.close();
    }
}

