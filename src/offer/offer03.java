package offer;

import java.util.HashSet;
import java.util.Set;

public class offer03 {
    // 方法一:用set集合进行对于重复数字的判断
//    public int findRepeatNumber(int[] nums) {
//        Set<Integer> set = new HashSet<>();
//
//        for (int i = 0; i < nums.length; i++) {
//            if (set.contains(nums[i])) {
//                return nums[i];
//            }
//            set.add(nums[i]);
//        }
//        return 0;
//    }

    //方法2:原地交换
    public int findRepeatNumber(int[] nums) {
        int tmp;
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i) {
                if (nums[i] == nums[nums[i]]) {
                    return nums[i];
                }

                tmp = nums[i];
                nums[i] = nums[tmp];
                nums[tmp] = tmp;
            }
        }
        return 0;
    }
}
