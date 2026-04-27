package Java8Features.inbuild;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class RealExamples {
    public static void main(String[] args) {
        // <title> cost $<price>
        BiFunction<String, Double, String> formatter = (title, price) ->title + "cost $" + price;
        System.out.println(formatter.apply("Java Basics", 599.49));
        System.out.println(formatter.apply(" Python Basics", 199.49));
        System.out.println(formatter.apply(" C++ Basics", 399.49));


        BiConsumer<String, Double> formatterConsumer = (title, price) -> System.out.println(title + "cost $" + price);
         formatterConsumer.accept("Java Basics", 599.49);
        formatterConsumer.accept(" Python Basics", 199.49);
        formatterConsumer.accept(" C++ Basics", 399.49);

        // isExpensive
        Predicate<Double> isExpensive = price -> price > 500;
        System.out.println(isExpensive.test(900.3));
    }
}
