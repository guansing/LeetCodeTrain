package dfs.basic_dfs;

public class test60 {
    public String getPermutation(int n, int k) {
        boolean[] used = new boolean[n + 1];
        StringBuilder path = new StringBuilder();
        int[] factorial = calculateFactorial(n);
        dfs(n, k, 0, used, path, factorial);
        return path.toString();
    }

    private void dfs(int n, int k, int index, boolean[] used, StringBuilder path, int[] factorial) {
        // 因为题目中要求的路径 path 是 string 类型的,所以这里用字符流输出定义路径这个变量类型
        // index 代表已经存入到path中的数字的个数
        if (index == n) {
            return;
        }

        int cnt = factorial[n - 1 - index];

        // 注意,对于这种从 1,2...,n 类型的顺序自然数,一定要从1开始,然后是 i <= n 的这种形式
        for (int i = 1; i <= n; i++) {
            if (used[i]) {
                continue;
            }
            if (cnt < k) {
                k = k-cnt;
                continue;
            }
            // 这里只需要做选择操作即可,无需进行撤销,反正只需要返回其中一种可能,一路走到底即可
            path.append(i);
            used[i] = true;
            dfs(n, k, index + 1, used, path, factorial);
            // 这里用 return 是因为后面的子树完全不需要了,直接结束程序
            return;
        }
    }

    private int[]  calculateFactorial(int n) {
        int[] factorial = new int[n + 1];
        factorial[0] = 1;
        for (int i = 1; i <= n; i++) {
            factorial[i] = factorial[i - 1] * i;
        }
        return factorial;
    }
}
