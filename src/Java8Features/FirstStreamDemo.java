package Java8Features;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FirstStreamDemo {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 2, 4, 3, 5);

        // Filter and collect into a list

        Set<Integer> duplicates = list.stream()
                .filter(n -> Collections.frequency(list, n) > 1)
                .collect(Collectors.toSet());
        System.out.println(duplicates);



    }

 }
