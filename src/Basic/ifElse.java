package Basic;

public class ifElse {
    public static void main(String[] args) {
        int age = 17;
        if (age > 18) {
            System.out.println("Welcome to our bank");
        } else {
            System.out.println("try again when you turn 18");
        }

        int marks = 70;
        if (marks > 90) {
            System.out.println("Grade A++");
        } else if (marks > 75) {
            System.out.println("Grade A");
        }
        else if (marks > 60) {
            System.out.println("Grade B");
        }



    }
}