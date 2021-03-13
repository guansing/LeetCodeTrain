package stack;

import java.util.Stack;

public class test503 {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[nums.length];
        int n = nums.length;
        for (int i = nums.length * 2 - 1; i >= 0;i--) {
            while (!stack.empty() && stack.peek() <= nums[i % n]) {
                stack.pop();
            }
            result[i % n] = stack.empty() ? -1 : stack.peek();
            stack.push(nums[i % n]);
        }
        return result;

    }
}
