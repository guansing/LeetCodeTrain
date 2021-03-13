package stack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class test496 {
    public Map<Integer, Integer> nextGreaterHelper(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = nums.length-1; i >= 0;i--) {
            while (!stack.empty() && stack.peek() <= nums[i]) {
                stack.pop();
            }
            map.put(nums[i], stack.isEmpty() ? -1 : stack.peek());
            stack.push(nums[i]);
        }
        return map;
    }


    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        Map<Integer, Integer> map = nextGreaterHelper(nums2);
        for (int i = 0; i < nums1.length;i++) {
            result[i] = map.get(nums1[i]);
        }
        return result;









//        // 时间复杂度(m * n)
//        // ArrayList<Integer> result = new ArrayList<>();
//        int[] result = new int[nums1.length];
//        Stack<Integer> stack1 = new Stack();
//
//        // 首先将 nums2 中的添加到第一个栈中
//        for (int num : nums2) {
//            stack1.push(num);
//        }
//
//        //
//        // 注意，这里不能像上面的那种遍历对象的方法，因为
//        for (int i = 0;i < nums1.length;i++) {
//            Stack<Integer> remainStack = new Stack();
//            boolean isFound = false;
//            int maxMun = -1;
//
//            // 获取具体的对象
//            int num = nums1[i];
//
//            while (stack1 != null && isFound == false) {
//                int top = stack1.pop();
//                if (top > num){
//                    maxMun = top;
//                } else if (top == num) {
//                    isFound = true; // 当 top 与 num 相等的时候，相当于已经找到，所以退出循环
//                } // top < num 的时候就不用去管了，因为 maxMum的初始值为 -1
//                // 在一次循环结束之后，将 maxMum 的值添加到数组中
//                remainStack.push(top);
//            }
//            result[i] = maxMun;
//
//            // 第二个 while 将数值还原回去
//            // 判断条件是如果负责临时存储的数组还不为空，说明并不是初始状态，所以需要还原回去
//            while (!remainStack.empty()) {
//                stack1.push(remainStack.pop());
//            }
//        }
//        return result;
    }
}
