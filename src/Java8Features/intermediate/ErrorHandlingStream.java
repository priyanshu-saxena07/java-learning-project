package Java8Features.intermediate;

import java.util.List;

public class ErrorHandlingStream {
    public static void main(String[] args) {
        List<String> books = List.of("Java", "Python", "C++");
        books.stream()
                .forEach(b -> {
                    try {
                        if (b.equals("Python"))
                            throw new RuntimeException("Invalid book");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                });
    }
}
