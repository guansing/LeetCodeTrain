package dp.track;

import java.util.Arrays;

public class test300 {
    public int lengthOfLIS(int[] nums) {
        // 首先定义一个 dp 数组,并且赋值初始值为1,因为最少也是1,即那个数的本身
        int len = nums.length;
        int res = 0;
        int[] dp = new int[len+1];
        Arrays.fill(dp, 1);
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
        }
        // 求上述dp的最大值
        for (int i = 0; i < dp.length; i++) {
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}
