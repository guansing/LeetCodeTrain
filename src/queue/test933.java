package queue;

import java.util.LinkedList;
import java.util.Queue;

public class test933 {
    Queue<Integer> queue;

    public test933() {
          queue = new  LinkedList<>();
    }

    public int ping(int t) {
        queue.add(t);
        while (t - queue.peek() > 3000 && queue.size() != 0){
            queue.poll();
        }
        return queue.size();
    }
}


/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */