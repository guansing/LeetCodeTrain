package binary_search;

import java.util.Arrays;

public class test34 {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int[] res = new int[2];
        while(left <= right) {
            int mid = left + (right-left)/2;
            if(nums[mid] < target) {
                left = mid + 1;
            }

            else if(nums[mid] > target) {
                right = mid - 1;
            }

            else if(nums[mid] == target) {
                right = mid - 1;
            }
        }
        if(left >= nums.length || nums[left] != target) {
            return new int[]{-1,-1};
        }
        res[0] = left;

        left = 0;
        right = nums.length-1;

        while(left <= right) {
            int mid = left + (right-left)/2;
            if(nums[mid] < target) {
                left = mid + 1;
            }

            else if(nums[mid] > target) {
                right = mid - 1;
            }

            else if(nums[mid] == target) {
                left = mid + 1;
            }
        }
        if(right < 0 || nums[right] != target) {
            return new int[]{-1,-1};
        }
        res[1] = right;

        return res;
    }
}
