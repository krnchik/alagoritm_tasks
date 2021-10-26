package com.krnchik.tasks.leetCode.Task20;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(3, new ListNode(4, null)));
        ListNode l2 = new ListNode(1, new ListNode(2, new ListNode(4, null)));
        new MergeTwoSortedLists().mergeTwoLists(l1, l2);
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(0);
        ListNode current = temp;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        if (l1 != null) {
            current.next = l1;
            l1 = l1.next;
        }

        if (l2 != null) {
            current.next = l2;
            l2 = l2.next;
        }

        return temp.next;
    }
}
