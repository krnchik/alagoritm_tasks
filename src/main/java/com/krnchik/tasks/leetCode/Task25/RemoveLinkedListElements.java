package com.krnchik.tasks.leetCode.Task25;

public class RemoveLinkedListElements {
    public static void main(String[] args) {
        System.out.println(new RemoveLinkedListElements()
                .removeElements(new ListNode(1,
                        new ListNode(2,
                                new ListNode(2,
                                        new ListNode(6,
                                                new ListNode(7, null))))), 2));
    }

    public ListNode removeElements(ListNode head, int val) {
        ListNode result = head;
        ListNode prev = null;

        while (head != null) {
            if (prev == null && head.val == val) {
                result = head.next;
                head = head.next;
                continue;
            }

            if (prev != null && head.val == val)
                prev.next = head.next;
            else
                prev = head;

            head = head.next;
        }

        return result;
    }
}
