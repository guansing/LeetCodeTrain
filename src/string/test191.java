package string;

public class test191 {
    // java 位运算相关的题目
    // & 是位与的运算,将两个32位的二进制数字进行比较,只有在对应的位数上一一对应的部分同时为 1 才会返回 true
    // << 是表示让 n 的二进制对应的数字向左移动 i 个位置(本题中即为将 1 对应的二进制向左移动 i 个位置,同时右边缺少的部分补 0)
    public int hammingWeight(int n) {
//        int res = 0;
//        for (int i = 0; i < 32; i++) {
//            if ((n & (1 << i)) != 0) {
//                res++;
//            }
//        }
//        return res;

        // 第二种解法可以让时间复杂度更低
        int res = 0;

        while (n != 0) {
            n = n & n-1;
            res++;
        }
        return res;
    }
}
