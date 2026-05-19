package Java8Features.inbuild;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

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

    public int getAge() {
        return age;
    }
}

public class StreamsDemo {
    public static void main(String[] args) {

        List<Person> list = Arrays.asList(
                new Person("Priyanka",23),
                new Person("Avni",22),
                new Person("Amit",28),
                new Person("Neha",30),
                new Person("Alok",32)
        );

        Person maxPerson = list.stream()
                .max(Comparator.comparing(Person::getAge))
                .orElse(null);


        System.out.println("Oldest Person Name: " + maxPerson.getName());
        System.out.println("Oldest Person Age: " + maxPerson.getAge());







    }
}


