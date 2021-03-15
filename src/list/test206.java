package list;

public class test206 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode reverseList(ListNode head) {
        if (head.next == null) {
            return head;
        }
        ListNode last = reverseList(head.next);


        head.next.next = head;
        head.next = null;
        return last;








//        ListNode dummy = new ListNode(0);
//        dummy.next = head;
//        while (head != null && head.next != null) {
//            ListNode dnext = dummy.next;
//            ListNode hnext = head.next;
//            dummy.next = hnext;
//            head.next = hnext.next;
//            hnext.next = dnext;
//        }
//        return dummy.next;
    }
}
