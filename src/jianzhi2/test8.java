package jianzhi2;

public class test8 {
    public int minSubArrayLen(int target, int[] nums) {
        int res = Integer.MAX_VALUE;
        int win = 0;
        int j = 0;
        for(int i = 0; i < nums.length; i++) {
            win += nums[i];
            while(j < i && win >= target) {
                res = Math.min(res, i - j + 1);
                win -= nums[j];
                j++;
            }
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }

    public static void main(String[] args) {
        test8 p = new test8();
        int t = 4;
        int[] a = {1,4,4};
        int r = p.minSubArrayLen(t, a);
        System.out.println(r);
    }
}
