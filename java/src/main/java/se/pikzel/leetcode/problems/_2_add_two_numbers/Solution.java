package se.pikzel.leetcode.problems._2_add_two_numbers;

// https://leetcode.com/problems/add-two-numbers/

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return new ListNode();
    }

    private int extractNumber(ListNode node) {
        return -1;
    }

    public ListNode reverse(ListNode node) {
        ListNode reversed = new ListNode();

        ListNode prev = null;
        for (ListNode l = node; l != null; l = l.next) {
            prev = l;


            System.out.println(l.val);
        }

        return reversed;
    }
}
