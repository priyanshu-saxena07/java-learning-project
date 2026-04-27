package NullSafety;

import java.util.Optional;

public class NPEDemo {
    public static void main(String[] args) {
        String name = "java";
        if (name != null)
            System.out.println(name.length());
        else
            System.out.println("No name value");

        // Optional
        Optional<String> optionalString = Optional.of("Java");
        System.out.println(optionalString);

        Optional<String> empty = Optional.empty();
        System.out.println(empty);

        Optional<String> mayBe = Optional.of("Null");
        System.out.println(mayBe);

        // Checking values
        System.out.println(optionalString.isPresent());
        System.out.println(mayBe.isPresent());

        System.out.println(optionalString.isEmpty());
        System.out.println(mayBe.isEmpty());

        // grt
        System.out.println(optionalString.orElse("default"));
        System.out.println(mayBe.orElse("default"));
        System.out.println(mayBe.orElse("null"));
        String temp = mayBe.orElse("default");


        // orElse()
        System.out.println();

        // orElseGet(<supplier>)
        String result = optionalString.orElseGet(() -> {
            System.out.println("Generating Default Value");
            return "default";
        });
        System.out.println(result);
        // orElse throw()
        String newResult = mayBe.orElseThrow(
                () -> new RuntimeException("Not Found")
        );
        System.out.println(newResult);
    }

    }