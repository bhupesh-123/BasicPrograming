package com.program;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubStringWithoutRepeatingChar {
    public static int longestSubstringWithoutRepeating(String str) {
        int maxLength = 0;
        int left = 0;
        HashSet<Character> seen = new HashSet<>();

        for (int right = 0; right < str.length(); right++) {
            char currentChar = str.charAt(right);

            // Remove characters from the left until no duplicate in the window
            while (seen.contains(currentChar)) {
                seen.remove(str.charAt(left));
                left++;
            }

            seen.add(currentChar);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
    public static int longestSubstringWithoutRepeatingHashMap(String str) {
        HashMap<Character, Integer> charIndexMap = new HashMap<>();
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < str.length(); right++) {
            char currentChar = str.charAt(right);

            if (charIndexMap.containsKey(currentChar)) {
                // Update the left pointer to the right of the last occurrence
                left = Math.max(left, charIndexMap.get(currentChar) + 1);
            }

            charIndexMap.put(currentChar, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println("Longest substring without repeating characters is of length: " + longestSubstringWithoutRepeating(str));
    }

}
