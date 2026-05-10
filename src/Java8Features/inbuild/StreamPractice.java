package Java8Features.inbuild;

import java.util.Arrays;
import java.util.List;

public class StreamPractice {
    public static void main(String[] args) {

         List<Integer> numbers = Arrays.asList(10,20,20,30,40,40,50);

         numbers.stream()
                 .filter(n -> n > 10)
                 .distinct()
                 .sorted()
                 .forEach(System.out::println);


    }
}
