public class llist_4 {public static class Solution {
    public llist_1.ListNode removeElements(llist_1.ListNode head, int val) {
        llist_1.ListNode dummy = new llist_1.ListNode(0);
        dummy.next = head;
        llist_1.ListNode prev = dummy;
        llist_1.ListNode current = head;
        while (current != null) {
            if (current.val == val) {
                prev.next = current.next;
            } else {

                prev = current;
            }
            current = current.next;
        }

        return dummy.next;
    }
    public static void main(String[] args)
    {
        llist_1.ListNode head = new  llist_1.ListNode(1);
        head.next = new  llist_1.ListNode(2);
        head.next.next = new  llist_1.ListNode(6);
        head.next.next.next = new  llist_1.ListNode(3);
        head.next.next.next.next = new  llist_1.ListNode(4);
        head.next.next.next.next.next = new  llist_1.ListNode(5);
        head.next.next.next.next.next.next = new  llist_1.ListNode(6);
        Solution sol = new Solution();
        llist_1.ListNode newHead = sol.removeElements(head, 6);
        System.out.print("Linked List after removing nodes with value " + 6 + ": ");
        llist_1.ListNode current = newHead;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
}
