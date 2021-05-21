package dfs;

import java.util.*;

public class test77 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        if (n < 0 || k < 0) {
            return res;
        }

        Deque<Integer> path = new ArrayDeque<>();

        dfs(n, k, 1, path, res);
        return res;
    }

    // 编写 dfs 递归函数, n 限制了树的宽度, k 限制了树的深度
    private void dfs(int n, int k, int begin, Deque<Integer> path, List<List<Integer>> combine) {
        if (path.size() == k) {
            combine.add(new ArrayList<>(path));
            return;
        }

        for (int i = begin; i <= n; i++) {
            path.addLast(i);
            dfs(n, k, i+1, path, combine);
            path.removeLast();
        }
    }
}
