package Java8Features.inbuild;

import java.util.function.Function;

public class FunctionInterfaceDemo {

    public static Function<Integer, Integer> addFunction = (a) -> a + 3;
    public static Function<Integer, Integer> multiplyFunction = (a) -> a * 2;

    public static void main(String[] args) {
        // It will do multiply first: (10 * 2) = 20, then addition: (20 + 3) = 23
        Function<Integer, Integer> composedFunction = addFunction.compose(multiplyFunction);

        System.out.println("Result of compose: " + composedFunction.apply(10));
        // Output: 23

    }
}
