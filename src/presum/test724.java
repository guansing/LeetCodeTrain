package presum;

public class test724 {
    public int pivotIndex(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res = res + nums[i];
        }

        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (leftSum + leftSum + nums[i] == res) {
                return i;
            }
            leftSum = leftSum + nums[i];
        }
        return -1;
    }
}
