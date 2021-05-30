package dfs.basic_dfs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class test47 {
    // 应该是对重复出现的数字进行剪枝操作
    // 在结果集中,如果对基本元素进行去重,一般采用哈希表进行
    // 对于比较两个列表是否一样,一般采用对列表进行排序
    public List<List<Integer>> permuteUnique(int[] nums) {
        int len = nums.length;
        Deque<Integer> path = new ArrayDeque<>(len);
        // 这里 new 一个动态数组
        List<List<Integer>> res = new ArrayList<>();
        boolean[] used = new boolean[len];
        if (len == 0) {
            return res;
        }
        dfs(nums, len, 0, used, path, res);
        return res;
    }


    private void dfs(int[] nums, int len, int depth, boolean[] used, Deque<Integer> path, List<List<Integer>> res) {
        if (depth == len) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < len; i++) {
            if (!used[i]) {
                if (nums[i] == nums[i-1] && !used[i-1]) {
                    continue;
                }
                path.addLast(nums[i]);
                used[i] = true;
                dfs(nums, len, depth+1, used, path, res);
                used[i] = false;
                path.removeLast();
            }
        }
    }
}
