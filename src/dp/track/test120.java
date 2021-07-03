package dp.track;

import java.util.List;

public class test120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        int length = triangle.size();
        int ans = Integer.MAX_VALUE;
        int[][] dp = new int[2][length];
        // 定义初始状态
        dp[0][0] = triangle.get(0).get(0);
        for (int i = 1; i < length; i++) {
            for (int j = 0; j <= i; j++) {
                int val = triangle.get(i).get(j);
                dp[i & 1][j] = Integer.MAX_VALUE;
                // 只要不是第一列,那么都可以由左上角转换过来
                if (j != 0) {
                    dp[i & 1][j] = Math.min(dp[i & 1][j], dp[(i-1) & 1][j-1] + val);
                }

                // 只要不是第i列(也就是最后一列),那么都可以由正上方转换过来
                if (j != i) {
                    dp[i & 1][j] = Math.min(dp[i & 1][j], dp[(i-1) & 1][j] + val);
                }
            }
        }

        // 对 dp 进行循环
        for(int i = 0; i < length; i++) {
            // 表示的是最后一行每个列的最小值
            ans = Math.min(ans, dp[(length-1) & 1][i]);
        }

        return ans;
    }
}

