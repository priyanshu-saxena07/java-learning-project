package Java8Features.inbuild;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("Apple", "banana", "Cherry");
        for (String fruit : items)
            System.out.println(fruit);

        // Using Streams
        Stream<String> stream = items.stream();
//        stream.forEach(System.out::println);
        stream.forEach((item) -> System.out.println());

        System.out.println("filter fruits");
//        Stream<String> streamNew = items.stream();
//        Stream<String> filteredStream
//                = streamNew.filter(name -> name.startsWith("c"));
//        filteredStream.forEach(System.out::println);

        items.stream()
                .filter(name -> name.startsWith("B"))
                .forEach(System.out::println);

    }
}
