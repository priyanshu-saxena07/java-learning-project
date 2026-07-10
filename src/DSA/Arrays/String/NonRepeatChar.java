package DSA.Arrays.String;

public class NonRepeatChar {

    public static char nonRepeatChar(String s) {
         // Frequency Array approach
        int[] freq = new int[26];

        // ek ek char ko peak karna ha
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']++; // count 0 to 26
        }

        // find the first char with a freq of 1
        for (int i =0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (freq[ch - 'a'] == 1) {
                return ch; // Found the first non-repeating char
            }
        }
        // Return '$' if every single character repeats
        return '$';
    }

    public static void main(String[] args) {
        String ch =  "racecar";

        System.out.println("Non Repeating char: " + nonRepeatChar(ch));

    }
}
