package DSA.Arrays;

import java.util.Arrays;

public class ReverseArray {

    public static void reverseArray(int[] nums) {
        // if array is empty
        if (nums == null || nums.length <= 1) {
            return;
        }
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            // Swap element
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};


        System.out.println("Before Reverse: " + Arrays.toString(arr));

        reverseArray(arr);


        System.out.println("After Reverse: " + Arrays.toString(arr));
    }
}
