package weektest;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class test5709_Old_Error {
    public int maxAscendingSum(int[] nums) {
        //int[] nums = {10, 20, 30, 5, 10, 50};
        //int[] nums = {10, 20, 30, 40, 50};
        //int[] nums = {1, 4, 20, 50};

        if (nums.length == 1) {
            System.out.println(nums);
            //return nums;
        }

        Stack<Integer> stack = new Stack<>();
        //stack.push(-1);
        int maxNum = 0;

        int countSum = 0;
        for (int i = 0; i <= stack.size(); i++) {


            stack.push(nums[i]);
            if (nums[i] < nums[i + 1]) {
                //stack.push(nums[i]);

                System.out.println("第 " + stack.peek());
                System.out.println("目前最大的数字是" + maxNum);
                if (i + 1 == nums.length - 1) {

                    System.out.println("当 nums[i] <   nums[i+1]");

                    System.out.println("第 " + stack.peek());
                    stack.push(nums[i + 1]);

                    System.out.println("第 " + stack.peek());

                    System.out.println("stack length is: " + stack.size());

                    for (int j = 0; j <= nums.length; j++) {
                        countSum = countSum + stack.peek();
                        System.out.println("第 " + j + "个栈中数字,该数为" + stack.peek());
                        System.out.println(countSum);
                        stack.pop();
                    }
                    if (countSum > maxNum) {
                        maxNum = countSum;
                        countSum = 0;
                    }
                }
            } else if (nums[i] >= nums[i + 1]) {
                System.out.println("当 nums[i] >= nums[i+1]");

                //stack.push(nums[i]);
                for (int j = 0; j <= stack.size(); j++) {
                    countSum = countSum + stack.peek();
                    System.out.println("第 " + j + "个栈中数字");
                    System.out.println(countSum);

                    stack.pop();
                }
                if (countSum > maxNum) {
                    maxNum = countSum;
                    countSum = 0;
                }
            }
        }

        return maxNum;

        //System.out.println("the result is:" + maxNum);
    }
}
