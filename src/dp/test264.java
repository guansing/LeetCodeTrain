package dp;

public class test264 {
    public int nthUglyNumber(int n) {
        int two = 1;
        int three = 1;
        int five = 1;

        int[] dp = new int[n+1];
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            int sum2 = 2 * dp[two];
            int sum3 = 3 * dp[three];
            int sum5 = 5 * dp[five];
            dp[i] = Math.min(sum2, Math.min(sum3, sum5));
            if (dp[i] == sum2) {
                two++;
            }
            if (dp[i] == sum3) {
                three++;
            }
            if (dp[i] == sum5) {
                five++;
            }
        }
        return dp[n];
    }
}
