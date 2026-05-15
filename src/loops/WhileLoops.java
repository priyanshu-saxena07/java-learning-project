package loops;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int  num = sc.nextInt();

        System.out.println("Enter second  number: ");
        int num1 = sc.nextInt();

        int sum = num + num1;
        System.out.println("Sum: " + sum);

    }
}