package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("Amit", "Rahul", "Amit", "Priyanshu"));

        List<String> uniqueNames = new ArrayList<>(new LinkedHashSet<>(names));
        System.out.println(uniqueNames);

    }
}
