package jianzhi2;

public class test72 {
    public int mySqrt(int x) {
        int l = 0;
        int r = x;
        int res = -1;
        while(l <= r) {
            int mid = l + (r - l) / 2;
            if(mid <= x / mid) {
                l = mid + 1;
                res = mid;
            } else {
                r = mid - 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        test72 t = new test72();
        int res = t.mySqrt(7);
        System.out.println(res);
    }
}
