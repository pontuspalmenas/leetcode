class Solution {
	/* Use naïve brute-force solution: it's readable and reasonably fast.
	   A hashmap based solution is faster for larger sets, but slower for smaller.
	*/
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i != j) return new int[] {i, j};
            }
        }
        throw new IllegalArgumentException();
    }
}