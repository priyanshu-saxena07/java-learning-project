package Arrays;

import java.util.LinkedHashSet;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] input = {1, 2, 2, 3, 4, 4, 5};

        // LinkedHashSet keeps unique elements in insertion order
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        // Try adding every number into the set
        for (int num : input) {
            set.add(num);
        }

        System.out.println("Original array: " + Arrays.toString(input));
        System.out.println("Without duplicates: " + set);
    }
}
