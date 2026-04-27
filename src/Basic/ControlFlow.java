package Basic;

public class ControlFlow {
    public static void main(String[] args) {
        int age = 17;
        if (age > 18) {
            System.out.println("Welcome to bank");
        } else {
            System.out.println("try again when ypu turn 18");
        }

        // if -else ladder
        int marks = 70;
        if (marks > 90) {
            System.out.println("Grade A+ ");
        } else if (marks > 80) {
            System.out.println("Grade A");
        }else if (marks > 75) {
            System.out.println("Grade B");
        } else {
            System.out.println("Grade F");
        }
        // switch
        String day = "Saturday";
        switch (day) {
            case "Monday" -> System.out.println("Start of the Week");
            case "Tusday" -> System.out.println("Working day");
            case "Friday" -> System.out.println("Enjoy your Weekend");
            case "Saturday" -> System.out.println("Weekend");
            case "Sunday" -> System.out.println("Aram karo");
            default -> System.out.println("holiday");
        }
    }
}
//  Initial commit - Java basics practice