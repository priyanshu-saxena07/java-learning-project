package Arrays;

public class PracticeArray {
    public static void main(String[] args) {

    int[] arr = {1,0,1,1,0,1,1};
    int zeroCount = 0;
    int oneCount = 0;
        for (int num : arr) {
            if (num == 0) {
                zeroCount++;
            } else {
                oneCount++;
            }

        }
        System.out.println("zeroCount: " + zeroCount);
        System.out.println("oneCount: " +   oneCount);

    }
}


 //     int[] numbers = {12, -7, 5, -3, 14, -1, 0, -8, 9};
//
//        int posSum = 0;
//        int negSum = 0;
//        for (int num : numbers) {
//            if (num > 0) {
//                 posSum += num;
//            } else if (num < 0) {
//                 negSum += num;
//            }
//        }
//
//        System.out.println("PosSum: " + posSum);
//        System.out.println("NegSum: " + negSum);



