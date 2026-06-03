package Arrays;

public class PracticeArray {

    public static int getUnsortedElement(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i+1] < arr[i]) {
                return arr[i+1];
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 5, 4, 9};
        System.out.println(getUnsortedElement(arr)); // Output: 4
    }
}




//       int[] arr = {1,0,1,1,0,1,1};
//    int zeroCount = 0;
//    int oneCount = 0;
//        for (int num : arr) {
//            if (num == 0) {
//                zeroCount++;
//            } else {
//                oneCount++;
//            }
//
//        }
//        System.out.println("zeroCount: " + zeroCount);
//        System.out.println("oneCount: " +   oneCount);

