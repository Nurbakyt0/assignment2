public class llist_5 {public static class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}


    public static ListNode deletDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }public static void main(String[] args) {

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        ListNode result = deletDuplicates(node1);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
