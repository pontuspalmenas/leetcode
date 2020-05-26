package se.pikzel.leetcode.problems._2_add_two_numbers;

// https://leetcode.com/problems/add-two-numbers/

public class Problem2Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return new ListNode();
    }

    private int extractNumber(ListNode node) {
        return -1;
    }

    public ListNode reverse(ListNode node) {
        ListNode curr = node;
        ListNode prev = null;
        ListNode next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public ListNode numberToList(int number) {
        ListNode node = new ListNode();
        ListNode prev = null;
        int len = (int)Math.log10(number);
        for (int i = len; i >= 0; i--) {
            int part = number / (int)Math.pow(10, i);
            number -= part * (int)Math.pow(10, i);

            node.val = part;
            node.next = new ListNode();
        }

        return node;
    }
}
