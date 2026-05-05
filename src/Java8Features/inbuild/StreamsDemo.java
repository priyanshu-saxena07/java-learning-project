package Java8Features.inbuild;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
}

public class StreamsDemo {
    public static void main(String[] args) {

        List<Person> list = Arrays.asList(
                new Person("Priyanshu",23),
                new Person("Avni",22)
        );

       List<String> names = list.stream()
               .map(Person::getName)
               .collect(Collectors.toList());

        System.out.println(names);
    }
}
