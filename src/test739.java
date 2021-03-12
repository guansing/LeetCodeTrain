import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class test739 {
    public int[] dailyTemperatures(int[] T) {

        //vector<int> res(T.size());
        int[] result = new int[T.length];
        // 这里放元素索引，而不是元素
        Stack<Integer> s = new Stack<>();
        /* 单调栈模板 */
        for (int i = T.length - 1; i >= 0; i--) {
            while (!s.empty() && T[s.peek()] <= T[i]) {
                s.pop();
            }
            // 得到索引间距
            result[i] = s.empty() ? 0 : (s.peek() - i);
            // 将索引入栈，而不是元素
            s.push(i);
        }
        return result;

    }
}
