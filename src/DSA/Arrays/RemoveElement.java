package DSA.Arrays;

public class RemoveElement {


    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }

        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }


    public static void main(String[] args) {
        RemoveElement solution = new RemoveElement();

        int[] nums = {3, 2, 2, 3};
        int val = 3;

        int k = solution.removeElement(nums, val);
        System.out.println("Result Count: " + k);
    }
}
