package presum;

import java.util.HashMap;
import java.util.Map;

public class test523 {
    public boolean checkSubarraySum(int[] nums, int k) {
        int len = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        if (len < 2) {
            return false;
        }

        map.put(0, -1);
        int presum = 0;
        for (int i = 0; i < len; i++) {
            presum = (presum + nums[i]) % k;
            if (map.containsKey(presum)) {
                int left = map.get(presum);
                if (i - left > 1) {
                    return true;
                }
            } else {
                map.put(presum, i);
            }
        }
        return false;
    }
}
