package Java8Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FirstStreamDemo {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        numbers.stream()
                .filter(n -> n % 2 != 0)
                .forEach(n -> System.out.println(n));

        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

            numbers.stream()
                    .filter(n -> n % 2 ==0)
                    .forEach(n -> System.out.println(n));




    }

 }
