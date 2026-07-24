package Collections;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {
    @SuppressWarnings("DuplicateSetElement")
    public static void main(String[] args) {
        Set<String> fruits = new LinkedHashSet<>(Arrays.asList("Apple", "Banana", "Orange", "Apple"));

        System.out.println("Fruits in LinkedHashSet: " + fruits);
        System.out.println("Is Banana in the set? " + fruits.contains("Banana"));
    }
}
