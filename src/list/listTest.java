package list;

import java.util.LinkedList;
import java.util.List;

public class listTest {
    public static void main(String args[]) {



        List<Integer> list = new LinkedList<>();
        list.add(3);
        list.add(5);
        List<Integer> listRes = list;




//        System.out.println(list);
//        System.out.println(listRes);
//        System.out.println("===========");
//        System.out.println(list.hashCode());
//        System.out.println(listRes.hashCode());



        ListNode listNode1 = new ListNode(1);

        ListNode listNode2 = listNode1;

        listNode1.next = new ListNode(3);


        int listnode2_val = listNode2.val;
        System.out.println(listnode2_val);

        System.out.println(listNode1);
        System.out.println(listNode2);


        // int a = listNode1.next.val;

        // System.out.println(a);


    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
