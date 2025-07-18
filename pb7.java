// 3. Longest Substring Without Repeating Characters
// Solved
// Medium
// Topics
// premium lock icon
// Companies
// Hint
// Given a string s, find the length of the longest substring without duplicate characters.

 

// Example 1:

// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3.
// Example 2:

// Input: s = "bbbbb"
// Output: 1
// Explanation: The answer is "b", with the length of 1.
// Example 3:

// Input: s = "pwwkew"
// Output: 3
// Explanation: The answer is "wke", with the length of 3.
// Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 

// Constraints:

// 0 <= s.length <= 5 * 104
// s consists of English letters, digits, symbols and spaces.


import java.util.HashMap;
import java.util.Map;

class Solution {
    /**
     * Finds the length of the longest substring without repeating characters.
     * @param s The input string.
     * @return The length of the longest substring.
     */
    public int lengthOfLongestSubstring(String s) {
        // Return 0 if the string is null or empty.
        if (s == null || s.length() == 0) {
            return 0;
        }

        // A map to store the most recent index of each character.
        // Key: Character, Value: Index
        Map<Character, Integer> charIndexMap = new HashMap<>();
        
        int maxLength = 0;
        int left = 0; // The left pointer (start) of the sliding window.

        // The right pointer iterates through the string to expand the window.
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            // If the character is already in the map and its last seen index is
            // within the current window (i.e., >= left), we have a duplicate.
            if (charIndexMap.containsKey(currentChar) && charIndexMap.get(currentChar) >= left) {
                // To resolve the duplicate, we must shrink the window from the left.
                // Move the left pointer to the position immediately after the
                // last occurrence of the current character.
                left = charIndexMap.get(currentChar) + 1;
            }

            // Update the last seen index of the current character.
            charIndexMap.put(currentChar, right);

            // Calculate the length of the current valid window.
            int currentLength = right - left + 1;
            
            // Update the maximum length found so far.
            maxLength = Math.max(maxLength, currentLength);
        }

        return maxLength;
    }
}
public class pb7 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "abcabcbb"; // Example input
        int result = solution.lengthOfLongestSubstring(s);
        System.out.println("Length of the longest substring without repeating characters: " + result);
    }}