package Java8Features.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperationDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 55);

        // 1. reduce() - Stream reuse demo
        Stream<Integer> integerStream = numbers.stream();
        int sum = integerStream.reduce(0, Integer::sum);
        System.out.println("Sum using stream variable: " + sum);

        // Direct reduction (Cleaner approach)
        int total = numbers.stream().reduce(0, Integer::sum);
        System.out.println("Total sum: " + total);

        // 2. collect() - Corrected filter logic for odd/even
        List<Integer> oddNumbers = numbers.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toList());
        System.out.println("Odd Numbers: " + oddNumbers);

        // Modern Java 16+ alternative for collecting to list
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println("Even Numbers: " + evenNumbers);

        // 3. findFirst() & findAny() - Safe handling using orElse
        int firstElement = numbers.stream().findFirst().orElse(-1);
        int anyElement = numbers.stream().findAny().orElse(-1);
        System.out.println("First Element: " + firstElement);
        System.out.println("Any Element: " + anyElement);

        // 4. match() - Corrected naming matching the logic
        boolean has40 = numbers.stream().anyMatch(n -> n == 40);
        System.out.println("Contains 40? " + has40);

        // 5. iteration - forEach
        System.out.println("--- All Elements ---");
        numbers.forEach(System.out::println); // Direct list iteration is better than numbers.stream().forEach()
    }
}

