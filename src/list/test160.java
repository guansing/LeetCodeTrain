package list;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class test160 {
      public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
         val = x;
          next = null;
      }
  }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> visited = new HashSet<ListNode>();
        ListNode temp = headA;
        while (temp != null) {
            visited.add(temp);
            temp = temp.next;
        }
        ListNode temp_b = headB;
        while (temp_b != null) {
            if (visited.contains(temp_b)) {
                return temp_b;
            }
            temp_b = temp_b.next;
        }
        return null;
    }
}
