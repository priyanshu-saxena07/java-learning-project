package Java8Features.inbuild;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class practice {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 5, 7, 2, 8, 8, 6);
        Integer secondHighest = numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1).findFirst().orElseThrow(() -> new RuntimeException("Not found"));

        System.out.println("Second Highest: " + secondHighest);
    }
}
