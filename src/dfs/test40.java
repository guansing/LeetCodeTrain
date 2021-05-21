package dfs;

import java.util.*;

public class test40 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        int len = candidates.length;
        List<List<Integer>> res = new ArrayList<>();
        Deque<Integer> step = new ArrayDeque<>();
        if (len == 0) {
            return res;
        }
        // 注意排序
        Arrays.sort(candidates);

        dfs(candidates, len, 0, target, step, res);
        return res;
    }

    private void dfs(int[] candidates, int len, int begin, int target, Deque<Integer> step, List<List<Integer>> res) {
        if (target == 0) {
            res.add(new ArrayList<>(step));
        }

        for (int i = begin; i < len; i++) {
            if (target - candidates[i] < 0) {
                break;
            }

            if (i > begin && candidates[i] == candidates[i-1]) {
                continue;
            }

            step.addLast(candidates[i]);

            // 注意更新 target 数值
            dfs(candidates, len, i+1, target-candidates[i], step, res);
            step.removeLast();
        }
    }

}
