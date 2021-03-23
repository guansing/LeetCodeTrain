package dfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class test46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dfs(nums, path, res);
        return res;
    }

    private void dfs(int[] nums, List<Integer> path, List<List<Integer>> res) {
        if (path.size() == nums.length) {
            // 返回一个新的 ArrayList 的原因是因为确保res与path中的路径不指向同一个地址
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (path.contains(nums[i])) {
                continue;
            }

            path.add(nums[i]);
            dfs(nums, path, res);
            path.remove(path.size() - 1);
        }
    }
}
