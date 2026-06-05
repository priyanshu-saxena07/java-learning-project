package Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DifferentSourcesDemo {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        Stream<Integer> integerStream = numbers.stream();
        integerStream.forEach(System.out::println);


        int[] numberArray = {1, 2, 3, 4};
        IntStream arrayStream = Arrays.stream(numberArray);
        arrayStream.forEach(System.out::println);
    }
}