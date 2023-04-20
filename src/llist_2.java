public class llist_2 {
    public static class LinkedList{
        public llist_1.ListNode revers(llist_1.ListNode head) {
            llist_1.ListNode perv = null;
            llist_1.ListNode currv = head;
            while (currv != null){
                llist_1.ListNode nextNode = currv.next;
                currv.next = perv;
                perv = currv;
                currv = nextNode;
            }
            return perv;
        }}
    public static void main(String[] args){
        llist_1.ListNode head = new llist_1.ListNode(1);
        head.next = new llist_1.ListNode(2);
        head.next.next = new llist_1.ListNode(3);
        head.next.next.next = new llist_1.ListNode(4);
        head.next.next.next.next = new llist_1.ListNode(5);
        LinkedList s = new LinkedList();
        llist_1.ListNode rev = s.revers(head);
        System.out.println("reversed list: ");
        while (rev != null){
            System.out.println(rev.val + " ");
            rev= rev.next;
        }
    }
}