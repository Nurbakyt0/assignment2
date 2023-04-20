public class llist_7 {
    static class Solution {
        public int maxTwinSum(llist_1.ListNode head) {
            int n = 0;
            llist_1.ListNode curr = head;
            while (curr != null) {
                n++;
                curr = curr.next;
            }
            int twinSum = 0;
            curr = head;
            for (int i = 0; i < n / 2; i++) {
                int twin = curr.val + getNthNode(head, n - 1 - i).val; // calculate twin sum
                twinSum = Math.max(twinSum, twin);
                curr = curr.next;
            }
            return twinSum;
        }

        public llist_1.ListNode getNthNode(llist_1.ListNode head, int n) {
            llist_1.ListNode curr = head;
            for (int i = 0; i < n; i++) {
                curr = curr.next;
            }
            return curr;
        }
    }public static void main(String[] args){
        llist_1.ListNode head = new llist_1.ListNode(4);
        head.next = new llist_1.ListNode(2);
        head.next.next = new llist_1.ListNode(2);
        head.next.next.next = new llist_1.ListNode(3);

        Solution solution = new Solution();
        int maxTwinSum = solution.maxTwinSum(head);
        System.out.println("Maximum Twin Sum: " + maxTwinSum);
    }
}
