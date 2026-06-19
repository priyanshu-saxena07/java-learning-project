package Java8Features.inbuild;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {

        Predicate<Double> HighSalary = salary -> salary > 85000;
        System.out.println(HighSalary.test(50000.0));
        System.out.println(HighSalary.test(90000.0));

    }
}


//      Predicate<Integer> isEven = n -> n % 2 == 0;
//        System.out.println(isEven.test(10));
//        System.out.println(isEven.test(20));
//
//        BiPredicate<Integer, Integer> isSumEven = (a, b) -> (a + b) % 2 ==0;
//        System.out.println(isSumEven.test(10,201));