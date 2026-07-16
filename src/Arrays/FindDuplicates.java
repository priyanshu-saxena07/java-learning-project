package Arrays;

import java.util.HashSet;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 2, 8, 5, 9};
        HashSet<Integer> set = new HashSet<>();

        System.out.print("Duplicate elements: ");
        for (int num : arr) {

            if (!set.add(num)) {
                System.out.print(num + " ");
            }
        }
    }
    }
