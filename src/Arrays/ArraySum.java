package Arrays;

public class ArraySum {
    public static void main(String[] args) {
//         int[] arr = {5, 2, 9, 1, 7};
//
//         int sum =  0;
//
//        for (int i = 0; i < arr.length; i++) {
//            sum = sum + arr[i];
//        }
//
//        System.out.println("Sum: " + sum);


        // Count Even number in Array
        int[] arr = {5, 2, 9, 1, 7, 4, 8};

         int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0)
                 count++;
        }
        System.out.println("Count of even numbers: " + count);
        }

    }

