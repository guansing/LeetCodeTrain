package dfs;

import java.util.LinkedList;
import java.util.Queue;

public class test1190 {
    public String reverseParentheses(String s) {
        StringBuilder res = new StringBuilder();
        Queue<Character> q = new LinkedList<>();

        for (char c : s.toCharArray()) {
            q.offer(c);
        }
        dfs(res, q);
        return res.toString();
    }

    private void dfs(StringBuilder res, Queue<Character> q) {
        while (!q.isEmpty()) {
            char c = q.poll();
            if (c == '(') {
                res.append(c);
                dfs(res, q);
                res.deleteCharAt(c);
            } else if (c == ')') {
                res.reverse();
            } else {
                res.append(c);
            }
        }
    }
}
