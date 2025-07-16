class Solution {
    public int maximumLength(int[] nums) {
        int n = nums.length;
        
        // Try all 4 possible patterns:
        // Pattern 0: remainder 0 (even + even = even, odd + odd = even)
        // Pattern 1: remainder 1 (even + odd = odd, odd + even = odd)
        
        int maxLen = 0;
        
        // Pattern 0: All consecutive pairs sum to even
        // This means: even,even,even... OR odd,odd,odd... OR even,even,odd,odd,even,even...
        // But actually, for remainder 0, we need same parity consecutive elements
        for (int remainder = 0; remainder <= 1; remainder++) {
            // Try starting with each possible first element parity
            for (int startParity = 0; startParity <= 1; startParity++) {
                int len = 0;
                int expectedParity = startParity;
                
                for (int i = 0; i < n; i++) {
                    int currentParity = nums[i] % 2;
                    
                    if (currentParity == expectedParity) {
                        len++;
                        if (len > 1) {
                            // Update expected parity for next element based on remainder pattern
                            if (remainder == 0) {
                                // For remainder 0: next element should have same parity
                                expectedParity = currentParity;
                            } else {
                                // For remainder 1: next element should have different parity  
                                expectedParity = 1 - currentParity;
                            }
                        } else {
                            // First element, next should follow the pattern
                            if (remainder == 0) {
                                expectedParity = currentParity;
                            } else {
                                expectedParity = 1 - currentParity;
                            }
                        }
                    }
                }
                
                maxLen = Math.max(maxLen, len);
            }
        }
        
        return maxLen;
    }
}
public class leetcode_3401 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] nums = {1, 2, 3, 5, 7, 8, 10};  // You can change the input here
        int result = solution.maximumLength(nums);
        
        System.out.println("Maximum Length: " + result);
    }
}