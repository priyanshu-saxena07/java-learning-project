package DSA.Arrays;

public class FindUnique {

    public static int findUnique(int[] arr) {
        int unique = 0;

        for (int num : arr) {
            unique = unique ^ num;
        }
        return unique;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 6, 3, 6, 2};

        System.out.println(findUnique(arr));
    }
}
