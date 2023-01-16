package jianzhi2;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class test38 {
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        Deque<Integer> stack = new LinkedList<>();
        int[] res = new int[len];
        for(int i = 0; i < len; i++) {
            int temper = temperatures[i];
            while(!stack.isEmpty() && temperatures[stack.peek()] < temper) {
                int index_num = stack.pop();
                res[index_num] = i - index_num;
            }
            stack.addLast(i);
        }
        return res;
    }

    public static void main(String[] args) {
        test38 t = new test38();
        int[] arr = {75,71,69,72,76};
        int[] rr = t.dailyTemperatures(arr);
        System.out.println(Arrays.toString(rr));
    }
}
