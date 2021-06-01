package presum;

// 前缀和模板
//int n = nums.length;
//// 前缀和数组
//        int[] preSum = new int[n + 1];
//        preSum[0] = 0;
//        for (int i = 0; i < n; i++)
//        preSum[i + 1] = preSum[i] + nums[i];

public class test1744 {
    public boolean[] canEat(int[] candiesCount, int[][] queries) {
        long[] presum = new long[candiesCount.length];
        presum[0] = candiesCount[0];
        for (int i = 1; i < candiesCount.length; i++) {
            presum[i] = presum[i-1] + candiesCount[i];
        }
        boolean[] res = new boolean[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            int type = query[0];
            int day = query[1];
            int cap = query[2];
            long x_left = day + 1;
            // 一定要强制转换
            long x_right = (long) (day + 1) * cap;
            long y_left = type == 0 ? 1 : presum[type - 1] + 1;
            long y_right = presum[type];

            if (!(x_left > y_right || x_right < y_left)) {
                res[i] = true;
            } else {
                res[i] = false;
            }
        }
        return res;
    }
}
