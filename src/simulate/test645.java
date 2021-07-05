package simulate;

import java.util.*;

public class test645 {
    public int[] findErrorNums(int[] nums) {
//        int n = nums.length;
//        int[] cnts = new int[n + 1];
//        for (int x : nums) cnts[x]++;
//        int[] ans = new int[2];
//        for (int i = 1; i <= n; i++) {
//            if (cnts[i] == 0) ans[1] = i;
//            if (cnts[i] == 2) ans[0] = i;
//        }
//        return ans;



        int length = nums.length;
        int[] res = new int[2];
        int[] arr = new int[length+1];
        for (int num : nums) {
            arr[num]++;
        }
        for (int i = 1; i <= nums.length; i++) {
            if (arr[i] == 0) {
                res[1] = i;
            }
            else if (arr[i] == 2) {
                res[0] = i;
            }
        }
        return res;
    }

//    public static void main(String[] args) {
//        test645 a = new test645();
//        int[] nums = {3,2,3,4,6,5};
//
//        int[] res = a.findErrorNums(nums);
//        System.out.println(Arrays.toString(res));
//    }
}
