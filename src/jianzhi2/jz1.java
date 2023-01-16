package jianzhi2;

public class jz1 {
    public int divide(int a, int b) {
        boolean flag = true;
        // 相当于最开始讨论出a和b异号的这种情况，如果异号那么最后的结果取反
        if(a < 0 && b > 0 || a > 0 && b < 0) {
            flag = false;
        }
        // 下面讨论的都是a和b均为负数的情况，这样是为了防止溢出，所以一开始要完全确保a和b都是负数
        if(a > 0) {
            a = -a;
        }
        if(b > 0) {
            b = -b;
        }
        int res = 0;
        int d = b;
        // 因防止溢出，所以反过来，按照a和b都是负数的情况来考虑
        while(a <= d) {
            int c = 1;
            while(b >= Integer.MIN_VALUE / 2 && b + b >= a) {
                b += b;
                c += c;
            }
            a -= b;
            res += c;
        }
        return flag ? res : -res;
    }

    public static void main(String[] args) {
        jz1 j = new jz1();
        int a = j.divide(3, 1);
        System.out.println(a);
    }
}
