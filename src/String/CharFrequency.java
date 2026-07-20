package String;

import java.util.HashMap;
import java.util.Map;

public class CharFrequency {
    public static void main(String[] args) {
        String input = "noida sector 63";

        // Convert string to char array and iterate
        Map<Character, Integer> freqMap = new HashMap<>();

        for (char c : input.toCharArray()) {
            if (c == ' ') continue;

            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());

        }
    }
}
