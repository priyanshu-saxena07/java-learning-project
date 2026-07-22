package DSA.Arrays;

public class Move0TwoEnd {

    public static void move0TwoEnd(int[] arr) {
        int n = arr.length;
        int j = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }

        }
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        move0TwoEnd(arr);

        for (int num: arr) {
            System.out.print(num + " ");
        }
    }
}
    //  Brute Force Approach

//  public class Solution {
//    public static void pushZerosAtEnd(ArrayList<Integer> arr) {
//        int n = arr.size();
//        ArrayList<Integer> temp = new ArrayList<>();
//
//        // Step 1: Copy non-zero elements
//        for (int i = 0; i < n; i++) {
//            if (arr.get(i) != 0) {
//                temp.add(arr.get(i));
//            }
//        }
//
//        // Step 2: Fill the remaining spots with zeros
//        while (temp.size() < n) {
//            temp.add(0);
//        }
//
//        // Step 3: Copy back to the original array
//        for (int i = 0; i < n; i++) {
//            arr.set(i, temp.get(i));
//        }

//  after  Brute Force Approach i will explain two Pointer Approach

// Answer sir i can try to optimize the space complexity to O(1), we need an in-place
//          solution. If we use an opposite-direction two-pointer approach (one
//  pointer at the start and one at the end), it will fail because swapping
//  elements from the back to the front disrupts the relative order of the
//  non-zero elements. Therefore, the best solution is a same-direction
//  two-pointer approach where both pointers start from index 0."