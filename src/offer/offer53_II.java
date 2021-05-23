package offer;

public class offer53_II {
    public int missingNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return nums.length;
    }
}
