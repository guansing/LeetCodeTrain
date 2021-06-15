package dfs.basic_dfs;


public class test494 {
    int count = 0;

    public int findTargetSumWays(int[] nums, int target) {

        dfs(nums, target, 0, 0);
        return count;
    }

    private void dfs(int[] nums, int target, int depth, int sum) {
        if (depth == nums.length) {
            if (sum == target) {
                count++;
            }
        } else {
            dfs(nums, target, depth+1, sum + nums[depth]);
            dfs(nums, target, depth+1, sum - nums[depth]);
        }
    }
}
