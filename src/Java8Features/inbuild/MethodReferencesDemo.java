package Java8Features.inbuild;

import java.util.Arrays;
import java.util.List;

public class MethodReferencesDemo {
    public static void main(String[] args) {
        // ::
        List<String> names = Arrays.asList("Alice", "Charlie", "bob");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        // using enhanced for
        for (String name : names)
            System.out.println(name);

//        names.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });
//        names.forEach((String s) -> {
//                System.out.println(s);
//        });

//        names.forEach((name) -> {
//            System.out.println(name);
//        });

//        names.forEach((name) -> System.out.println(name));

        names.forEach(System.out::println);

    }
}
