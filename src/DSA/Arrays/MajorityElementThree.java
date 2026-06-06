package DSA.Arrays;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementThree {

    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        if (nums == null || nums.length == 0) return result;


        int num1 = 0, num2 = 0, count1 = 0, count2 = 0;


        for (int num : nums) {
            if (num == num1) {
                count1++;
            } else if (num == num2) {
                count2++;
            } else if (count1 == 0) {
                num1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                num2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }


        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (num == num1) count1++;
            else if (num == num2) count2++;
        }

        int threshold = nums.length / 3;
        if (count1 > threshold) result.add(num1);
        if (count2 > threshold) result.add(num2);

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 5, 5, 5, 4, 9, 8};
        int[] arr2 = {3, 2, 3};

        System.out.println("Test 1: " + majorityElement(arr));
        System.out.println("Test 2: " + majorityElement(arr2));
    }
}
