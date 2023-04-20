public class llist_1 {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int  val){
            this.val = val;
        }
    }public static class Mid{
        public ListNode midlnode(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;
            while (fast != null && fast.next != null){
                slow= slow.next;
                fast = fast.next.next;
            }

            return slow;
        }
    }public static void main(String[] args){
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4  = new ListNode(4);
        ListNode node5  = new ListNode(5);
        ListNode node6  = new ListNode(6);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        Mid s = new Mid();
        ListNode mid = s.midlnode(head);
        System.out.println("Midle notes of Linked list: ");
        while (mid != null){
            System.out.println(mid.val + " ");
            mid = mid.next;
        }
        System.out.println();
    }
}