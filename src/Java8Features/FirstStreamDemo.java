package Java8Features;

import java.util.*;

public class FirstStreamDemo {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 20, 30, 20, 40, 10, 50, 70, 88, 40);

        Optional<Integer> secondHighest = numbers.stream()
                .distinct()                           // Removes duplicates
                .sorted(Comparator.reverseOrder())    // Sorts descending
                .skip(1)                              // Skips the highest
                .findFirst();                       // Fetches the immediate next element


        secondHighest.ifPresent(val -> System.out.println("Second highest number is: " + val));


    }

 }


