package stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

public class test456 {
    public boolean find132pattern(int[] nums) {
        // 单调栈
        int k = Integer.MIN_VALUE;
        int n = nums.length;
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = n - 1; i >=0; i--) {
            if (nums[i] < k) {
                return true;
            }

            while (!stack.isEmpty() && nums[i] > stack.peekLast()) {
                k = stack.pollLast();
            }
            stack.addLast(nums[i]);
        }
        return false;


//        if (nums.length < 3) {
//            return false;
//        }
//
//        int first_val = nums[0];
//        int third_val = 0;
//
//        for (int i = 1; i < nums.length; i++) {
//            third_val = nums[i];
//            first_val = Math.min(nums[0], nums[i - 1]);
//            if (first_val >= third_val) {
//                continue;
//            } else {
//                for (int j = i + 1; j < nums.length; j++) {
//                    int second_val = nums[j];
//                    if (second_val > first_val && third_val > second_val) {
//                        return true;
//                    }
//                }
//            }
//        }
//        return false;
    }
}
