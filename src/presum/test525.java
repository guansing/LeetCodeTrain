package presum;

import java.util.HashMap;
import java.util.Map;

public class test525 {
    public int findMaxLength(int[] nums) {
        int length = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[i] = -1;
            }
            //System.out.println(nums[i]);
        }

        int presum = 0;
        // 因为前缀和的长度比nums数组多一个下标,所以让下标比 0 还小1的-1,然后初始值设置为0
        map.put(0 , -1);
        //System.out.println(presum);
        // 设置一个前缀和
        for (int i = 0; i < nums.length; i++) {
            presum = presum + nums[i];
            //System.out.println(presum);

            if (map.containsKey(presum)) {
                int left = map.get(presum);
                if (i - left >= length) {
                    length = i - left;
                }
            } else {
                map.put(presum, i);
            }
        }
        return length;
    }
}
