public class llist_3 {
    public static class LinkedListtwo{
        public llist_1.ListNode rever(llist_1.ListNode head) {
            if (head == null || head.next == null){
                return head;
            }else {
                llist_1.ListNode newhead = rever(head.next);
                head.next.next = head;
                head.next = null;
                return newhead;
            }

        }
    }
    public static void main(String[] args){
        llist_1.ListNode head = new llist_1.ListNode(1);
        head.next = new llist_1.ListNode(2);
        head.next.next = new llist_1.ListNode(3);
        head.next.next.next = new llist_1.ListNode(4);
        head.next.next.next.next = new llist_1.ListNode(5);
        LinkedListtwo c = new LinkedListtwo();
        llist_1.ListNode reve = c.rever(head);
        System.out.println("reversed list: ");
        while (reve != null){
            System.out.println(reve.val + " ");
            reve= reve.next;
        }
    }
}
