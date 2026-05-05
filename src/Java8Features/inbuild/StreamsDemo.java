package Java8Features.inbuild;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
                new Person("Avni",22),
                new Person("Amit",28),
                new Person("Neha",30),
                new Person("Aalok",32)
        );

       List<String> names = list.stream()
               .filter(p -> p.age > 22)
               .map(Person::getName)
               .sorted()
               .collect(Collectors.toList());

        System.out.println(names);
    }
}
