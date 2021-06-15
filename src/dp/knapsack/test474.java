package dp.knapsack;

public class test474 {
    public int findMaxForm(String[] strs, int m, int n) {
        int len = strs.length;
        int[][][] dp = new int[len+1][m+1][n+1];

        for (int i = 1; i <= len; i++) {
            int[] count = count_zero_and_one(strs[i-1]);
            // 这里 j 和 k 从0 开始的原因是因为要考虑到一个字符串中所有的数字均为0或是均为1的这种情况
            for (int j = 0; j <= m; j++) {
                for (int k = 0; k <= n; k++) {
                    dp[i][j][k] = dp[i-1][j][k];
                    int zeros = count[0];
                    int ones = count[1];
                    if (j >= zeros && k >= ones) {
                        // dp[i-1][j - zeros][k - ones] + 1 在末尾加 1 的原因是多选择其中的一个子集
                        dp[i][j][k] = Math.max(dp[i-1][j][k], dp[i-1][j - zeros][k - ones] + 1);
                    }
                }
            }
        }
        return dp[len][m][n];
    }

    // 将当前字符串逐个遍历,分别能够存放0的个数与1的个数
    private int[] count_zero_and_one(String str) {
        int[] cnt = new int[2];
        for (char s : str.toCharArray()) {
            cnt[s - '0']++;
        }
        return cnt;
    }
}
