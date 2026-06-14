package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratingDemo {
    public static void main(String[] args) {
        List<String> users = new ArrayList<>();
        users.add("Alice");
        users.add("Bob");
        users.add("Charlie");
        users.add("John");

        // 1. For-each loop
        System.out.println("USING FOR EACH:");
        for (String user : users) {
            System.out.println(user);
        }

        // 2. Standard For loop
        System.out.println("\nUSING FOR LOOP:");
        for (String user : users) {
            System.out.println(user);
        }

        // 3. Iterator (Safe for removing elements)
        System.out.println("\nUSING ITERATOR (Removing 'Alice'):");
        Iterator<String> it = users.iterator();
        while (it.hasNext()) {
            String user = it.next();
            System.out.println(user);

            if (user.equals("Alice")) {
                it.remove();
            }
        }

        // 4. Modern Java Lambda / Method Reference
        System.out.println("\nUSING LAMBDA / METHOD REFERENCE:");
        users.forEach(System.out::println);

    }
}
