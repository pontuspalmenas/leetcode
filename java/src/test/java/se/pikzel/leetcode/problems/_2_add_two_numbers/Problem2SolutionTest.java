package se.pikzel.leetcode.problems._2_add_two_numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem2SolutionTest {
    @Test
    void reverseList() {
        var input = new ListNode(1, new ListNode(2));
        var reverse = new Problem2Solution().reverse(input);
        dump(reverse);
        assertEquals(2, reverse.val);
        assertEquals(1, reverse.next.val);
    }

    @Test
    void fisk() {
        dump(new Problem2Solution().numberToList(123));
    }

    private void dump(ListNode n) {
        while (n != null) {
            System.out.print("" + n.val + " -> ");
            n = n.next;
        }
    }
}
