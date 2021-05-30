package dfs.basic_dfs;

public class test112 {
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

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        // 递归终止条件
        if (root.left == null && root.right == null) {
            if (targetSum - root.val == 0) {
                return true;
            } else {
                return false;
            }
        }

        boolean bool_left = false;
        boolean bool_right = false;

        // 因为是二叉树,所以需要分别对左和右两种根节点进行讨论
        if (root.left != null) {
            bool_left = hasPathSum(root.left, targetSum - root.val);
        }

        if (root.right != null) {
            bool_right = hasPathSum(root.right, targetSum - root.val);
        }

        return bool_left || bool_right;

    }



}
