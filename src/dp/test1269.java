package dp;

public class test1269 {
    public int numWays(int steps, int arrLen) {
        final int MODULO = 1000000007;
        int maxColumn = Math.min(arrLen-1, steps/2+1);
        int[][] dp = new int[steps+1][maxColumn+1];
        dp[0][0] = 1;

        for (int i = 1; i <= steps; i++) {
            for (int j = 0; j <= maxColumn; j++) {
                dp[i][j] = dp[i-1][j];
                if (j > 0) {
                    dp[i][j] = (dp[i-1][j-1]) % MODULO;
                }
                if (j < maxColumn) {
                    dp[i][j] = (dp[i-1][j+1]) % MODULO;
                }
            }
        }
        return dp[steps][0];
    }
}
