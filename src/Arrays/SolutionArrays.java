package Arrays;

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("ConstantConditions")
public class SolutionArrays {
    public static void main(String[] args) {

    int[] arr = {10,30,30,20,55,5,7,55,};
    if (arr == null || arr.length == 0) {
        System.out.println("Array is empty");
        return;
    }

        Set<Integer> uniqueNumber = new HashSet<>();
        System.out.println("Duplicate Element");

        for (int num: arr) {
            if (!uniqueNumber.add(num)) {
                System.out.println(num);
            }
        }


    }
}

//  int[] numbers = {1, 2, 3, 4, 5, 6};
//
//        for (int num : numbers) {
//            if (num % 2 != 0) {
//                int squared = num * num;
//                System.out.println(squared);
//            }
//        }