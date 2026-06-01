package Arrays;

public class PracticeArray {
    public static void main(String[] args) {
        int[] numbers = {12, -7, 5, -3, 14, -1, 0, -8, 9};

        int posSum = 0;
        int negSum = 0;
        for (int num : numbers) {
            if (num > 0) {
                 posSum += num;
            } else if (num < 0) {
                 negSum += num;
            }
        }

        System.out.println("PosSum: " + posSum);
        System.out.println("NegSum: " + negSum);





    }
}

//       int[] arr = {1,2,3,4,5,6,7};
//
//        int sum = 0;
//
//        for (int num : arr) {
//            sum += num;
//        }
//        double average = (double) sum / arr.length;
//        System.out.println("Average = " + average);



