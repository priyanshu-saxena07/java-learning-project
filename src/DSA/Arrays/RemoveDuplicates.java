package DSA.Arrays;


public class RemoveDuplicates {


    public int removeDuplicates(int[] nums) {
       if (nums.length == 0) {
           return 0;
       }
       int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }

        }
            return j + 1;

        }

    // ✅ Main method bhi class ke andar hai
    public static void main(String[] args) {
        RemoveDuplicates obj = new RemoveDuplicates();

        int[] nums = {1, 1, 2};
        int k = obj.removeDuplicates(nums);

        System.out.println("Unique elements: " + k);
    }
}

