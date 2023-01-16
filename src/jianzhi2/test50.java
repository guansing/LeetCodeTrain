package jianzhi2;

public class test50 {
    int res = 0;
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null) {
            return 0;
        }
        // 调用这个函数是以当前根节点为基准进行判断
        traverse(root, targetSum);
        pathSum(root.left, targetSum);
        pathSum(root.right, targetSum);
        return res;
    }

    public void traverse(TreeNode root, int targetSum) {
        if(root == null) {
            return;
        }
        if(root.val == targetSum) {
            res++;
        }
        // Java的值传递和引用传递特性
        // 直接在递归函数中进行相减的好处就是，如果能够执行并满足结果那么就进行运算，反之回溯
        targetSum -= root.val;
        traverse(root.left, targetSum);
        targetSum += root.val;

        targetSum -= root.val;
        traverse(root.right, targetSum);
        targetSum += root.val;
    }

    public static void main(String[] args) {
        test50 t = new test50();
        TreeNode tree = new TreeNode(715827882,715827882,null,715827882,null,1,null,715827882,null,715827882,null,715827882,null);
        int res = t.pathSum(tree, -3);
        System.out.println(res);
    }
}

