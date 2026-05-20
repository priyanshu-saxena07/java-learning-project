package Java8Features.intermediate;

import java.util.List;
import java.util.Arrays;

public class ErrorHandlingStream {
    public static void main(String[] args) {

        List<String> inputs = Arrays.asList("10", "abc", "30");

        inputs.stream()
                .map(str -> {
                    try {
                        return Integer.parseInt(str);
                    } catch (NumberFormatException e) {
                        System.out.println("Found bad data: " + str + ". Using fallback -1");
                        return -1;
                    }
                })
                .forEach(System.out::println);
    }
}
