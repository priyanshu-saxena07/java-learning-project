package Arrays;

public class LinearSearch {
    public static void main(String[] args) {
       int[] arr = {1, 4, 6, 8};
       int target = 4;

       int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }
        System.out.println(index);
        }

    }


    //           int[] arr = {1, 3, 5, 7};
//        int target = 5;
//
//        int index = -1;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == target) {
//                index = i;
//                break;
//            }
//        }
//        System.out.println(index);