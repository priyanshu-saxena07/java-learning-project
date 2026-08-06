package Arrays;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 2, 8, 5, 9};

        System.out.print("Duplicate elements: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " "); // Output: 2 4
                }
            }
        }
    }
}
