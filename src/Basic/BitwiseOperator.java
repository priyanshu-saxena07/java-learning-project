package Basic;

import java.util.Scanner;

public class BitwiseOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int count = 0;

        while (n != 0) {
            n = n & (n - 1);
            count++;
        }

        System.out.println("Set bit Count: " + count);
        sc.close();


    }
}
