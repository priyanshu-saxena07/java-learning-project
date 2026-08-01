package DSA.Arrays.String;

public class AnagramCheck {
    public boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        // Frequency array for 26 alphabets
        int[] count = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a' ]++; // Increment for s1
            count[s2.charAt(i) - 'a' ]--; // Increment for s2
        }
        // Check if all buckets are 0
        for (int val : count) {
            if (val != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
         AnagramCheck solver = new AnagramCheck();

        // Test Case 1: True case
        String test1_s1 = "geeks";
        String test1_s2 = "kseeg";
        System.out.println("Test 1 Result: " + solver.isAnagram(test1_s1, test1_s2));
        // Expected Output: true

        // Test Case 2: False case
        String test2_s1 = "allergy";
        String test2_s2 = "allergyy";
        System.out.println("Test 2 Result: " + solver.isAnagram(test2_s1, test2_s2));
        // Expected Output: false


    }
}
