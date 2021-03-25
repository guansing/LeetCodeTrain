package list;

public class test82 {
      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;
        if (head.val != head.next.val) {
            //如果当前节点和下一个节点的值不相同
            head.next = deleteDuplicates(head.next);
            return head;
        } else {
            //如果当前节点和下一个节点的值相同，说明出现了重复的，要把它删除
            while (head.next != null && head.val == head.next.val)
                head = head.next;
            return deleteDuplicates(head.next);
        }
    }


}
