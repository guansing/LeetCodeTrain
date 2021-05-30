package dfs.basic_dfs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class test78 {
    public List<List<Integer>> subsets(int[] nums) {
        Deque<Integer> path = new ArrayDeque<>();
        List<List<Integer>> res = new ArrayList<>();
        dfs(nums, 0, path, res);
        return res;
    }

    private void dfs(int[] nums, int begin, Deque<Integer> path, List<List<Integer>> res) {
        res.add(new ArrayList<>(path));

        for (int i = begin; i < nums.length; i++) {
            path.addLast(nums[i]);
            dfs(nums, i+1, path, res);
            path.removeLast();
        }
    }

}
