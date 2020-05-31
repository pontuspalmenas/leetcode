package se.pikzel.leetcode.problems._2_add_two_numbers;

// https://leetcode.com/problems/add-two-numbers/

public class Problem2Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        long sum = listToNumber(l1) + listToNumber(l2);
        return numberToReversedList(sum);
    }

    private ListNode numberToReversedList(long number) {
        if (number == 0) return new ListNode(0);
        ListNode node = null;
        while (number > 0) {
            int digit = (int)(number % 10);
            node = addNode(node, new ListNode(digit));
            number = number / 10;
        }

        return node;
    }

    private long listToNumber(ListNode node) {
        long sum = 0;
        int i = 0;
        ListNode p = node;
        while (p != null) {
            sum += p.val * powerN(10, i);
            p = p.next;
            i++;
        }

        return sum;
    }

    long powerN(long number, int power){
        long res = 1;
        long sq = number;
        while(power > 0){
            if(power % 2 == 1){
                res *= sq;
            }
            sq = sq * sq;
            power /= 2;
        }
        return res;
    }

    private ListNode addNode(ListNode head, ListNode n) {
        ListNode p = head;
        if (head == null) return n;
        else {
            while (p.next != null) {
                p = p.next;
            }
            p.next = n;
        }
        return head;
    }
}
