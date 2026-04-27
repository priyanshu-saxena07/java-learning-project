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

        // for each
        System.out.println("USING FOR EACH");
        for (String user : users)
            System.out.println(user);

        // FOR LOOP
        System.out.println("USING FOR LOOP");
        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i));
        }
        // ITERATOR
        System.out.println("USING ITERATOR");
        Iterator<String> it = users.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
            if (it.next().equals("Alice"));
            it.remove();
        }
        System.out.println("USING FOR EACH");
        for (String user : users)
            System.out.println(user);
    }
}
