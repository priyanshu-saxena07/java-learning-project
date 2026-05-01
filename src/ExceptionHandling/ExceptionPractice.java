package ExceptionHandling;

import java.util.Scanner;

public class ExceptionPractice {
    public static void main(String[] args) {


        try {
            int[] arr = {10,20,30};
            System.out.println(arr[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception");
        } finally {
            System.out.println("I always run anyway");
        }

    }
}





//  Q2. Array Exception
//Create array of size 5
//Ask user for index
//Print element
//
//Handle:
//
//Invalid index
//Wrong input type