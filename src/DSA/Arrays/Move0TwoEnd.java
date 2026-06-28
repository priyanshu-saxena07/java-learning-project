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
