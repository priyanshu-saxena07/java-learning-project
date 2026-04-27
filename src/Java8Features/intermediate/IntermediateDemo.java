package Java8Features.intermediate;

import java.util.ArrayList;
import java.util.List;

public class IntermediateDemo {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        books.add(new Book("The Alchemist", 1988, 299.99, "Fiction"));
        books.add(new Book("Clean Code", 2008, 499.50, "Programming"));
        books.add(new Book("Rich Dad Poor Dad", 1997, 350.00, "Finance"));
        books.add(new Book("Atomic Habits", 2018, 450.75, "Self-Help"));
        books.add(new Book("Wings of Fire", 1999, 275.00, "Biography"));
        books.add(new Book("Think and Grow Rich", 1937, 300.00, "Motivation"));
        books.add(new Book("The Pragmatic Programmer", 1999, 550.00, "Programming"));
        books.add(new Book("Harry Potter and the Sorcerer's Stone", 1997, 400.00, "Fantasy"));
        books.add(new Book("The Power of Now", 1997, 320.00, "Spiritual"));
        books.add(new Book("Ikigai", 2016, 280.00, "Philosophy"));
        System.out.println(books);
    }
}
