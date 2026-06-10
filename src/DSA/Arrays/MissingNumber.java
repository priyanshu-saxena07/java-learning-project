package DSA.Arrays;

public class MissingNumber {

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int xorSum = n;


        for (int i = 0; i < n; i++) {
            xorSum = xorSum ^ i ^ nums[i];
        }
        return xorSum;
    }

    public static void main(String[] args) {

        int[] arr = {0,2,1,4,5};
        int ans = missingNumber(arr);

        System.out.println("Missing number: " + ans);
    }
}
