package loops;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
//      // for loop
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Countdown: " + i);
//        }
        // while loop
        int i = 1;
        while(i <= 30) {
            if (i % 2 != 0) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }


    }
}