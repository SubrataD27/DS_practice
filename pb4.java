// Given an array of integers nums of unique elements. Return all possible subsets (power set) of the array.



// Do not include the duplicates in the answer.


// Examples:
// Input : nums = [1, 2, 3]

// Output : [ [ ] , [1] , [2] , [1, 2] , [3] , [1, 3] , [2, 3] , [1, 2 ,3] ]

// Input : nums = [1, 2]

// Output : [ [ ] , [1] , [2] , [1,2] ]


// Solution:

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> powerSet(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, nums, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int start, int[] nums, List<Integer> current, List<List<Integer>> result) {
        result.add(new ArrayList<>(current));  // add a copy of the current subset

        for (int i = start; i < nums.length; i++) {
            current.add(nums[i]);  // include nums[i]
            backtrack(i + 1, nums, current, result);  // recurse
            current.remove(current.size() - 1);  // backtrack
        }
    }
}

public class pb4 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = solution.powerSet(nums);

        // Print the power set
        System.out.println("Power Set:");
        for (List<Integer> subset : result) {
            System.out.println(subset);
        }
    }
}
