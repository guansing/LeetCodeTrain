package presum;

public class test560 {
    public int subarraySum(int[] nums, int k) {
        int len = nums.length;
        int[] presum = new int[len+1];
        for (int i = 0; i < len; i++) {
            presum[i + 1] = presum[i] + nums[i];
        }

        int res = 0;

        for (int left = 0; left < len; left++) {
            for (int right = left; right < len; right++) {
                // right 变量肯定在 left 变量的至少右边一个,这样才有意义
                // 而且如果 right 不加一,那么 right 就达不到最后一个数值
                if (presum[right+1] - presum[left] == k) {
                    res = res + 1;
                }
            }
        }
        return res;
    }
}