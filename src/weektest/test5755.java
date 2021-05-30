package weektest;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

public class test5755 {
    public int minPairSum(int[] nums) {
        int res = 0;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            int sum = nums[i] + nums[nums.length-1-i];
            if (sum > res) {
                res = sum;
            }
        }
        return res;
    }
}
