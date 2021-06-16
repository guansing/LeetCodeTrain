package offer;

import java.util.Arrays;

public class offer57 {
    public int[] twoSum(int[] nums, int target) {
        // 二分法
        int left = 0;
        int len = nums.length;
        int[] res = new int[2];
        int right = len - 1;
        while(left <= right) {
            if (nums[left] + nums[right] < target) {
                left++;
            }

            else if (nums[left] + nums[right] > target) {
                right--;
            }

            else if (nums[left] + nums[right] == target) {
                res[0] = nums[left];
                res[1] = nums[right];
                break;
            }
        }
        return res;
    }

//    public static void main(String[] args) {
//        offer57 a = new offer57();
//        int[] nums = {2,7,11,15};
//        int target = 9;
//        int[] res = a.twoSum(nums, target);
//        System.out.println(Arrays.toString(res));
//    }
}
