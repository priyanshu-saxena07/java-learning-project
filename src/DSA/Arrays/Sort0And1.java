package DSA.Arrays;

import java.util.Arrays;

public class Sort0And1 {

    public static void sort0And1(int n, int[] A) {
        int i = 0;
        int j = n - 1;

        while (i < j) {
            if (A[i] == 0) {
                i++;
            } else if (A[j] == 1) {
                j--;
            } else {
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                i++;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0,1,1,1,0,0,1};
        int n = arr.length;

        System.out.println("Original Array (Sort hone se pehle):");
        System.out.println(Arrays.toString(arr));

        sort0And1(n, arr);

        System.out.println("\nSorted Array (Output):");
        System.out.println(Arrays.toString(arr));
    }
}
