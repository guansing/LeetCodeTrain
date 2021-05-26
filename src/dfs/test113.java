package dfs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class test113 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        Deque<Integer> path = new ArrayDeque<>();
        List<List<Integer>> res = new ArrayList<>();
        // 对 root 进行判断
        if (root == null) {
            return res;
        }

        dfs(root, targetSum, path, res);
        return res;
    }

    private void dfs(TreeNode root, int targetSum, Deque<Integer> path, List<List<Integer>> res) {
        // 这种情况实际上也同时说明了此时到达了叶子节点,因为前面dfs都是对于根节点遍历的,所以说这一步还需要一次回溯的过程,目的是为了把根节点的结果加入到path中
        // 递归终止条件是到达叶子节点,也就是左右叶子节点同时为 0 的时候
        if (root.left == null && root.right == null) {
            if (targetSum - root.val == 0) {
                path.addLast(root.val);
                res.add(new ArrayList<>(path));
                path.removeLast();
                return;
            }
        }


        // 因为是二叉树,所以分别讨论左和右两种
        if (root.left != null) {
            path.addLast(root.val);
            dfs(root.left, targetSum - root.val, path, res);
            path.removeLast();
        }

        if (root.right != null) {
            path.addLast(root.val);
            dfs(root.right, targetSum - root.val, path, res);
            path.removeLast();
        }
    }
}