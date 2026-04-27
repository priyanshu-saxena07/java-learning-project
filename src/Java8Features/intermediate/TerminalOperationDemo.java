package Java8Features.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperationDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 55);
        // reduce()
        Stream<Integer> integerStream = numbers.stream();
//        int sum = integerStream.reduce(0,(acc, num) -> acc + num);
        int sum = integerStream.reduce(0, Integer::sum);
        System.out.println("sum:" + sum);

        int total = numbers.stream()
                .reduce(0,Integer::sum);
        System.out.println("total: " + total);

        // collect()
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toList());
        System.out.println("EVEN NUMBERS:" + evenNumbers);


        // find & match
        System.out.println(numbers.stream().findFirst().get());
        System.out.println(numbers.stream().findAny().get());

        boolean has40 = numbers.stream()
                .anyMatch(n -> n == 41);
        System.out.println(has40);

        // iteration
        numbers.stream()
                .forEach(System.out::println);

    }
}
