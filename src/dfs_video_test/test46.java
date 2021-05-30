package dfs_video_test;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class test46 {
    public List<List<Integer>> permute(int[] nums) {
        int len = nums.length;
        Deque<Integer> path = new ArrayDeque<>();
        List<List<Integer>> res = new ArrayList<>();
        boolean[] used = new boolean[len];
        if (len == 0) {
            return res;
        }

        dfs(path, used, nums, res, 0,len);
        return res;
    }

    private void dfs(Deque<Integer> path, boolean[] used, int[] nums, List<List<Integer>> res,
                     int depth, int len) {
        if (depth == len) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < len; i++) {
            if (!used[i]) {
                path.addLast(nums[i]);
                used[i] = true;
                dfs(path, used, nums, res, depth+1, len);
                used[i] = false;
                path.removeLast();
            }
        }
    }
}
