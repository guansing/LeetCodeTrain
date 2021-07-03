package dp.track;

import java.util.Arrays;

public class test931 {
    public int minFallingPathSum(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;
        int res = Integer.MAX_VALUE;

        // 一般来说这里取最大值就行，如果不确定的话
        int board = Math.max(n, m);

        memo = new int[board][board];
        // 因为是二维数组,所以最外层还需要遍历一次高度
        for (int i = 0; i < n; i++) {
            Arrays.fill(memo[i], 66666);
        }
        // 终点可能在 matrix[n-1](也就是最后一行) 的任意一列
        for (int j = 0; j < n; j++) {
            res = Math.min(res, dp(matrix, n-1, j));
        }
        return res;
    }

    int memo[][];

    private int dp(int[][] matrix, int i, int j) {
        if (i < 0 || j < 0 || i >= matrix.length || j >= matrix[0].length) {
            return 99999;
        }

        if (i == 0) {
            return matrix[0][j];
        }

        if (memo[i][j] != 66666) {
            return memo[i][j];
        }

        memo[i][j] = matrix[i][j] + min(dp(matrix, i - 1, j), dp(matrix, i - 1, j - 1), dp(matrix, i - 1, j + 1));
        return memo[i][j];
    }

    private int min(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }
}
