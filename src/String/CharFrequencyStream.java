package String;

import java.util.Map;
import java.util.stream.Collectors;

public class CharFrequencyStream {
    public static void main(String[] args) {

        String str = "Amit";

        Map<Character, Long> frequencyMap = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        c -> c,
                        Collectors.counting()
                ));
        System.out.println(frequencyMap);
    }
}
