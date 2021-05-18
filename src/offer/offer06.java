package offer;

import java.util.LinkedList;
import java.util.Stack;

public class offer06 {
    public class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
  }

    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<Integer>();

        while (head != null) {
            stack.push(head.val);
            head = head.next;
            Integer a =head.val ;
            System.out.println(a);
        }
        int size = stack.size();
        int[] print = new int[size];
        for (int i = 0; i < size; i++) {
            print[i] = stack.pop();
        }
        return print;



//        Stack<ListNode> stack = new Stack<ListNode>();
//        ListNode temp = head;
//        while (temp != null) {
//            stack.push(temp);
//            temp = temp.next;
//        }
//        int size = stack.size();
//        int[] print = new int[size];
//        for (int i = 0; i < size; i++) {
//            print[i] = stack.pop().val;
//        }
//        return print;
    }
}
