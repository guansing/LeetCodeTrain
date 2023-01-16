package jianzhi2;

public class test3 {
    public int[] countBits(int n) {
        int[] res = new int[n+1];
        for(int i = 0; i <= n; i++) {
            if(i % 2 == 0) {
                res[i] = res[i/2];
            } else {
                res[i] = res[i-1] + 1;
            }
        }
        return res;
    }

}
