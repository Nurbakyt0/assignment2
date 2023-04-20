import java.util.Scanner;

public class llist_8 {
    static class Solution {
        public llist_1.ListNode findNthFromEnd(llist_1.ListNode head, int n) {
            llist_1.ListNode first = head;
            for (int i = 0; i < n; i++) {
                if (first == null) {
                    return null;
                }
                first = first.next;
            }
            llist_1.ListNode second = head;
            while (first != null) {
                first = first.next;
                second = second.next;
            }
            return second;
        }
    }public static void main(String[] args){
        llist_1.ListNode head = new  llist_1.ListNode(1);
        head.next = new  llist_1.ListNode(2);
        head.next.next = new  llist_1.ListNode(6);
        head.next.next.next = new  llist_1.ListNode(3);
        head.next.next.next.next = new  llist_1.ListNode(4);
        head.next.next.next.next.next = new  llist_1.ListNode(5);
        head.next.next.next.next.next.next = new  llist_1.ListNode(6);
        System.out.println("write the n=");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution sol = new Solution();
        llist_1.ListNode newHead = sol.findNthFromEnd(head, n);
        llist_1.ListNode current = newHead;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }

    }
}