package com.krnchik.tasks.leetCode.Task26;

import com.krnchik.tasks.leetCode.Task25.RemoveLinkedListElements;

public class RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {
        new RemoveDuplicatesFromSortedList()
                .deleteDuplicates(new ListNode(1,
                        new ListNode(2,
                                new ListNode(2,
                                        null))));
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode result = head;
        ListNode prev = null;

        while (head != null) {
            if (prev != null && head.val == prev.val)
                prev.next = head.next;
            else
                prev = head;

            head = head.next;
        }

        return result;
    }
}
