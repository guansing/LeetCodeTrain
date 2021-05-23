package weektest;

public class test1848 {
    public int getMinDistance(int[] nums, int target, int start) {
        int min = 100001;
        int temp;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                temp = Math.abs(i-start);
                if (temp < min) {
                    min = temp;
                }
            }
        }
        return min;
    }
}
