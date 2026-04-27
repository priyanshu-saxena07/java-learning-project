package Arrays;

public class findMinNumber {
    public static void main(String[] args) {
        // Find Minimum Element in Array

        int[] arr = {5, 2, 9, 1, 7};

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }

        }
        System.out.println("Min: " + min);
    }
}
