package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(12, 35, 1, 10, 34, 1));

        if (numbers.size() < 2) {
            System.out.println("Invalid Input");
            return;
        }

        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > highest) {
                secondHighest = highest;
                highest = num;
            } else if (num > secondHighest && num != highest) {
                secondHighest = num;
            }
        }


        System.out.println("Second Highest: " + secondHighest);

    }
    }



