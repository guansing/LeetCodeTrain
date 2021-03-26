package list;

public class test83 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }

        // 这里是指针
        ListNode cur = head;
        while (cur.next != null) {
            if (cur.val == cur.next.val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }

        return head;
    }


    // 这样做是错误的,因为会导致头结点的缺失
//    public ListNode deleteDuplicates(ListNode head) {
//        if (head == null) {
//            return head;
//        }
//
//        while (head.next != null) {
//            if (head.val == head.next.val) {
//                head.next = head.next.next;
//            } else {
//                head = head.next;
//            }
//        }
//        return head;
//    }
}
