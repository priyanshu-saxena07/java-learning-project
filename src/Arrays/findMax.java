package Arrays;

public class findMax {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8};

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }
            else if(arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }

        System.out.println(secondMax);

    }




}
