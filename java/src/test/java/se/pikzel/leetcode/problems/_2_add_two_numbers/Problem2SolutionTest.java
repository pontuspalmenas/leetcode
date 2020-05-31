package se.pikzel.leetcode.problems._2_add_two_numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem2SolutionTest {
    @Test
    void defaultCase() {
        var l1 = arrToList(new int[]{2,4,3});
        var l2 = arrToList(new int[]{5,6,4});

        var sum = new Problem2Solution().addTwoNumbers(l1,l2);

        assertEquals("[7,0,8]",listToString(sum));
    }

    @Test
    void zeroCase() {
        var l1 = new ListNode(0);
        var l2 = new ListNode(0);

        var sum = new Problem2Solution().addTwoNumbers(l1,l2);

        assertEquals(0, sum.val);
    }

    @Test
    void differentLengths() {
        var l1 = arrToList(new int[]{9});
        var l2 = arrToList(new int[]{1,9,9,9,9,9,9,9,9,9});

        var sum = new Problem2Solution().addTwoNumbers(l1,l2);
        assertEquals("[0,0,0,0,0,0,0,0,0,0,1]", listToString(sum));
    }

    @Test
    void case1561() {
        var l1 = arrToList(new int[]{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1});
        var l2 = arrToList(new int[]{5,6,4});

        var sum = new Problem2Solution().addTwoNumbers(l1,l2);
        dump(sum);
        assertEquals("[6,6,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1]", listToString(sum));
    }

    @Test
    void arrToListTest() {
        var l1 = arrToList(new int[]{1,2,3});
        var l2 = arrToList(new int[]{4,5});

        assertEquals(1, l1.val);
        assertEquals(2, l1.next.val);
        assertEquals(3, l1.next.next.val);
        assertEquals(4, l2.val);
        assertEquals(5, l2.next.val);
    }

    private ListNode arrToList(int[] arr) {
        ListNode list = null;
        for (var i : arr) {
            list = addNode(list, new ListNode(i));
        }
        return list;
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

    private void dump(ListNode n) {
        System.out.println(listToString(n));
    }

    private String listToString(ListNode n) {
        String s = "[";
        while (n != null) {
            s += n.val;
            if (n.next != null) s += ",";
            n = n.next;
        }
        s += "]";
        return s;
    }
}
