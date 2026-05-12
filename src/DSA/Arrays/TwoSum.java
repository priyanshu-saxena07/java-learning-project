package DSA.Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        // Test karne ke liye sample data
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // Solution call karna
        int[] result = solve(nums, target);

        // Result print karna
        System.out.println("Indices: " + Arrays.toString(result));
    }

    public static int[] solve(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        //      // Agar solution na mile
        return new int[] {-1, -1};
    }
    }

