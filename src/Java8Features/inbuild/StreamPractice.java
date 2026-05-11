package Java8Features.inbuild;

import java.util.Arrays;
import java.util.List;

public class StreamPractice {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10,20,20,30,40,40,50);

        double avg = numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);

        System.out.println(avg);
    }
}
