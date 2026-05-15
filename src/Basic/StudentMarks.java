package Basic;

import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your marks sub 1: ");
        int sub1 = sc.nextInt();

        System.out.println("Enter your marks sub 2: ");
        int sub2 = sc.nextInt();

        System.out.println("Enter your marks sub 3 ");
        int sub3 = sc.nextInt();

        int total = sub1 + sub2 + sub3;

        double average = total / 3.0;

        System.out.println("total marks: " + total);
        System.out.println("Average: " + average);
    }
}
