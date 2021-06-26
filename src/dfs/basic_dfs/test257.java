package dfs.basic_dfs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class test257 {
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

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();

        dfs(res, root, "");
        return res;
    }

    private void dfs(List<String> res, TreeNode root, String path) {
        // 如果到达叶子节点,就添加路径
        // 叶子节点的特点就是下一个是 null
        if (root == null) {
            return;
        }

//        StringBuilder str = new StringBuilder(path);
//        str.append(Integer.toString(root.val));
        path = path+ root.val;

        if (root.left == null && root.right == null) {
            res.add(path);
            return;
        } else {
//            str.append("->");
            path+="->";
            dfs(res, root.left, path);
            dfs(res, root.right, path);
        }

    }


}
