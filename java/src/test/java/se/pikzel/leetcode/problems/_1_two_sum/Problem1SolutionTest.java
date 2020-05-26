package se.pikzel.leetcode.problems._1_two_sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem1SolutionTest {
    @Test
    void testDefaultCase() {
        var nums = new int[]{2, 7, 11, 15};
        var target = 9;

        var expected = new int[]{0, 1};
        var result = new Problem1Solution().twoSum(nums, target);
        assertArrayEquals(expected, result);
    }

    @Test
    void testExtendedCase() {
        var nums = new int[]{3, 2, 4};
        var target = 6;

        var expected = new int[]{1, 2};
        var result = new Problem1Solution().twoSum(nums, target);
        assertArrayEquals(expected, result);
    }
}
