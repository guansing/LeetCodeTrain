package jianzhi2;

public class test10 {
    public int subarraySum(int[] nums, int k) {
        int i = 0;
        int j = 0;
        int len = nums.length;
        int sum = 0;
        int res = 0;
        while (j < len) {
            sum += nums[j];
            j++;
            // 当大于的时候，一定要收缩左侧边界，直到不大于为止
            if(sum > k) {
                while(sum > k) {
                    sum -= nums[i];
                    i++;
                }
            }
            if(sum == k) {
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        test10 t = new test10();
        int[] arr = {1,2,3,0,3};
        int a = t.subarraySum(arr, 3);
        System.out.println(a);
    }
}
