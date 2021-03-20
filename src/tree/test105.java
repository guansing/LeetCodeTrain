package tree;

import java.util.HashMap;

public class test105 {
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

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return myBuildTree(preorder, 0, preorder.length-1,inorder, 0, inorder.length-1, map);
    }

    private TreeNode myBuildTree(int[] preOrder, int preLeft, int preRight,
                                 int[] inOrder, int inLeft, int inRight, HashMap<Integer, Integer> map) {
        if (preLeft >= preRight || inLeft >= inRight) {
            return null;
        }

        int rootVal = preOrder[preLeft];
        TreeNode root = new TreeNode(rootVal);
        int rootIndex = map.get(rootVal);

        root.left = myBuildTree(preOrder, preLeft+1, rootIndex-inLeft+preLeft, inOrder, inLeft, rootIndex-1, map);
        root.right = myBuildTree(preOrder, rootIndex-inLeft+preLeft+1, preRight, inOrder, rootIndex+1, inRight, map);

        return root;
    }
}
