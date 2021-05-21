//package dfs;
//
//import java.util.ArrayDeque;
//import java.util.ArrayList;
//import java.util.Deque;
//import java.util.List;
//
//
//public class Solution {
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
//    private void dfs(int[] nums, int len, int depth,
//                     Deque<Integer> path, boolean[] used,
//                     List<List<Integer>> res) {
//        if (depth == len) {
//            System.out.println(path + "队列满了,将其中一种排列情况加入到数组中");
//            res.add(new ArrayList<>(path));
//            return;
//        }
//
//        for (int i = 0; i < len; i++) {
//            if (!used[i]) {
//                path.addLast(nums[i]);
//                used[i] = true;
//                System.out.println("此时该数字被加入到队列中,说明已经被使用");
//
//                System.out.println("  递归之前 => " + path);
//                System.out.println("在DFS执行前,此时的used情况为: "+used[i]);
//                dfs(nums, len, depth + 1, path, used, res);
//                System.out.println("在DFS都执行完成后,此时的used情况为: "+used[i]);
//
//                used[i] = false;
//                System.out.println("usd = false,需要换了");
//                path.removeLast();
//                System.out.println("递归之后 => " + path + used[i]);
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        int[] nums = {1, 2, 3};
//        Solution solution = new Solution();
//        List<List<Integer>> lists = solution.permute(nums);
//        System.out.println(lists);
//    }
//}
