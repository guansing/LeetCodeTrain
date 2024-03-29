//package dfs;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.ArrayDeque;
//import java.util.Deque;
//
//public class test46 {
//
//    public List<List<Integer>> permute(int[] nums) {
//        int len = nums.length;
//        // 使用一个动态数组保存所有可能的全排列
//        List<List<Integer>> res = new ArrayList<>();
//        if (len == 0) {
//            return res;
//        }
//
//        boolean[] used = new boolean[len];
//        Deque<Integer> path = new ArrayDeque<>(len);
//
//        dfs(nums, len, 0, path, used, res);
//        return res;
//    }
//
//    // dfs 递归方法涉及到 nums 数组
//    private void dfs(int[] nums, int len, int depth,
//                     Deque<Integer> path, boolean[] used,
//                     List<List<Integer>> res) {
//        if (depth == len) {
//            res.add(new ArrayList<>(path));
//            return;
//        }
//
//        for (int i = 0; i < len; i++)
//            if (!used[i]) {
//                path.addLast(nums[i]);
//                used[i] = true;
//                dfs(nums, len, depth + 1, path, used, res);
//                used[i] = false;
//                path.removeLast();
//            }
//        }
//
//    public static void main(String[] args) {
//        int[] nums = {1, 2, 3};
//        test46 solution = new test46();
//        List<List<Integer>> lists = solution.permute(nums);
//        System.out.println(lists);
//    }
//}
