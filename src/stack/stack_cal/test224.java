package stack.stack_cal;

import java.util.ArrayDeque;
import java.util.Deque;

public class test224 {
    char LEFT = '(';
    char RIGHT = ')';

    public int calculate(String s) {
        if (s == null || s.length() == 0) return 0;

        Deque<Character> q = new ArrayDeque<>();
        for (char c : s.toCharArray())
            if (c != ' ') q.offer(c);
        q.offer(' ');   // 确保最后一个 preNum 能被计算
        return helper(q);
    }
    private int helper(Deque<Character> q) {
        int res = 0;
        int preNum = 0;
        int curNum = 0;
        char preOp = '+';

        while (!q.isEmpty()) {
            char c = q.poll();
            if (Character.isDigit(c))  // 数字，比如 235, 568
                curNum = curNum * 10 + c - '0';
            else if (c == LEFT)        // 左括号，直接跟递归要结果
                curNum = helper(q);
            else {                    // 其他符号： + - * / )
                switch(preOp) {
                    case '+':
                        res += preNum;
                        preNum = curNum;
                        break;
                    case '-':
                        res += preNum;
                        preNum = -curNum;
                        break;
                    case '*':
                        preNum = preNum * curNum;
                        break;
                    case '/':
                        preNum = preNum / curNum;
                        break;
                }
                preOp = c;
                curNum = 0;
                if (c == RIGHT) break;
            }
        }

        res += preNum;
        return res;
    }
}