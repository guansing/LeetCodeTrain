package dfs;

import java.util.*;

public class test90 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Deque<Integer> path = new ArrayDeque<>();
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        dfs(nums, 0, path, res);
        return res;

    }

    private void dfs(int[] nums, int begin, Deque<Integer> path, List<List<Integer>> res) {
        res.add(new ArrayList<>(path));
        for (int i = begin; i < nums.length; i++) {
            if (i > begin && nums[i] == nums[i-1]) {
                continue;
            }
            path.addLast(nums[i]);
            dfs(nums, i+1, path, res);
            path.removeLast();
        }
    }
}
