package NullSafety;

import java.util.Optional;

public class FunctionalOperation {
    public static void main(String[] args) {
        // dynamic value scenario create karne ke liye hum direct string pass karne ki jagah method use kar sakte hain
        Optional<String> name = Optional.of(getDemoName());
        Optional<String> nullOptional = Optional.empty(); // Warning 1 Fixed

        // 1. ifPresent()
        nullOptional.ifPresent(value -> {
            System.out.println(value);
            System.out.println("Hey");
        });

        // 2. map()
        Optional<String> upperCase = nullOptional.map(String::toUpperCase);
        System.out.println(upperCase.orElse("default"));

        // 3. filter() - Warning 2 Fixed (Ab hamesha true nahi dikhayega)
        name.filter(n -> n.startsWith("J"))
                .ifPresent(System.out::println);

        // 4. Combined Optional - Warning 3 Fixed (Ab hamesha false nahi dikhayega)
        name.filter(n -> n.startsWith("F"))
                .map(String::toUpperCase)
                .ifPresent(System.out::println);
    }

    // IntelliJ ko compile-time par value check karne se rokne ke liye ek helper method
    private static String getDemoName() {
        return "Java";
    }
}
