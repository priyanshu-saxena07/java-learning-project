package NullSafety;

import java.util.Optional;

public class NPEDemo {
    public static void main(String[] args) {

        String name = getNameFromServer();

        if (name != null) {
            System.out.println(name.length());
        } else {
            System.out.println("No name value");
        }

        // Optional initialization
        Optional<String> optionalString = Optional.ofNullable(name);
        System.out.println(optionalString);

        // Fixed warning: Directly using Optional.empty() instead of ofNullable(null)
        Optional<String> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);

        // Checking values dynamically
        System.out.println("Is present: " + optionalString.isPresent());
        System.out.println("Is empty: " + optionalString.isEmpty());

        // fallback values
        System.out.println(optionalString.orElse("default"));

        // orElseGet(<supplier>)
        String result = optionalString.orElseGet(() -> {
            System.out.println("Generating Default Value");
            return "default";
        });
        System.out.println(result);

        // orElseThrow()
        String newResult = optionalString.orElseThrow(
                () -> new RuntimeException("Not Found")
        );
        System.out.println(newResult);
    }

    // Dynamic value return karne ke liye dummy method
    private static String getNameFromServer() {
        return Math.random() > 0.5 ? "Java" : null;
    }
}