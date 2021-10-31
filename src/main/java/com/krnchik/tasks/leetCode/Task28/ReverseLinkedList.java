package com.krnchik.tasks.leetCode.Task28;

public class ReverseLinkedList {
    public static void main(String[] args) {
        System.out.println(new ReverseLinkedList().reverseList(new ListNode(1,
                new ListNode(2,
                        new ListNode(2,
                                null)))));
    }

    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode prev = null;

        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }

        return prev;
    }

}
