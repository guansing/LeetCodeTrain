import java.util.LinkedList;

public class test203 {
     public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


    public ListNode removeElements(ListNode head, int val) {
         ListNode dummy = new  ListNode(0);
         dummy.next = head;
         ListNode pre = dummy;

         while (head != null) {
             if (head.val == val) {
                 pre.next = head.next;
             } else {
                 pre = head;
             }
             head = head.next;
         }
         return dummy.next;
    }
}
