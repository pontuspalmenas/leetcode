package se.pikzel.leetcode.problems._2_add_two_numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void reverseList() {
        var input = new ListNode(1, new ListNode(2));
        var reverse = new Solution().reverse(input);
        assertEquals(2, reverse.val);
        assertEquals(1, reverse.next.val);
    }
}