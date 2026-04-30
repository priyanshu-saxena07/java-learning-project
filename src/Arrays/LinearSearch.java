package Arrays;

public class LinearSearch {
    public static void main(String[] args) {

        int[] arr = {3, 7, 2, 9, 5};
        int target = 9;

        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }

        }
        System.out.println("Index: " + index);
        }

    }


