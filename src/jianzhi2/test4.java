package jianzhi2;

public class test4 {
    public int singleNumber(int[] nums) {
        int[] cnt = new int[32];
        for (int x : nums) {
            for (int i = 0; i < 32; i++) {
                if (((x >> i) & 1) == 1) {
                    cnt[i]++;
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            if ((cnt[i] % 3 & 1) == 1) {
                ans += (1 << i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        test4 t = new test4();
        int[] arr = {2,2,3,2};
        int res = t.singleNumber(arr);
        System.out.println(res);
    }
}
