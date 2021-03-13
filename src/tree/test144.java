package tree;

import java.util.ArrayList;
import java.util.List;

public class test144 {
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

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        preorder(root, res);
        return res;
    }

    public void preorder(TreeNode head, List<Integer> result) {
           if (head == null) {
               return;
           }
           result.add(head.val);
           preorder(head.left, result);
           preorder(head.right, result);
    }



}
