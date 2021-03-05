public class test485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxNum = 0;
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int count = 0;
        int result = 0;

        for (int i = 0;i < nums.length;i++) {
            if (nums[i] == 1){
                count = count + 1;
            }

            else if (nums[i] == 0) {
                if (count > result) {
                    result = count;
                }
                count = 0;
            }
        }

        if (nums[nums.length] == 1) {
            if (count > result) {
                result = count;
            }
        }
        return result;
    }
}
