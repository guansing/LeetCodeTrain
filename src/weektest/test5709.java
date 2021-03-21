package weektest;

import java.util.Stack;

public class test5709 {
    public static void main(String args[]) {
        int[] nums = {10,20,30,5,10,50};

        if (nums.length == 0) {
            //return 0;
            System.out.println("输出:0");
        }

        int ans = 0;
        int sum = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] > nums[i-1]) {
                sum = sum + nums[i];
            } else {
                sum = nums[i];
            }
            ans = Math.max(ans, sum);
        }

        //return ans;
        System.out.println("最终结果是"+ans);


    }
}
