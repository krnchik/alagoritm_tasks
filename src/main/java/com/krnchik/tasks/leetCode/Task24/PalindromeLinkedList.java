package com.krnchik.tasks.leetCode.Task24;

public class PalindromeLinkedList {
    public static void main(String[] args) {
        System.out.println(new PalindromeLinkedList()
                .isPalindrome(new ListNode(1,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(6,
                                                new ListNode(7, null)))))));
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        //First found the middle of the linkedlist

        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        //Then reversed the list after the mid point

        ListNode rev = reverse(slow);
        ListNode q = head;
        while (rev != null) {
            if (rev.val != q.val) {
                return false;
            }
            rev = rev.next;
            q = q.next;
        }
        return true;
    }

    public ListNode reverse(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode prev = null;
        while (head != null) {
            ListNode next_node = head.next;
            head.next = prev;
            prev = head;
            head = next_node;
        }
        return prev;
    }
}
