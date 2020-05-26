package se.pikzel.leetcode.problems._1_two_sum;

// https://leetcode.com/problems/two-sum/

public class Solution {
    // Use naïve brute-force solution: O(n^2) time, but O(1) space.
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i != j) return new int[] {i, j};
            }
        }
        throw new IllegalArgumentException();
    }
}
