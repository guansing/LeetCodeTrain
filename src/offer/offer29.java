package offer;

public class offer29 {
    public int[] spiralOrder(int[][] matrix) {
        // 首先判断数组是0的这个情况,直接返回0即可
        if (matrix[0].length == 0) {
            return new int[0];
        }

        // 初始化矩阵的上下左右
        int l = 0;
        int r = matrix[0].length-1;
        int t = 0;
        int b = matrix.length-1;

        // 初始化数组并设定一个数组的数字下标
        int[] res = new int[(r+1) * (b+1)];
        int x = 0;

        // 对于matrix[a][b]这个二维数组而言, a标示的不是横坐标,而是指二维数组中的第几行,所以从左到右和从右到左的 a 都不变
        while (true) {
            // l -> r
            for (int i = l; i <= r; i++) {
                res[x++] = matrix[t][i];
            }
            if (++t > b) {
                break;
            }
            // t -> b
            for (int i = t; i <= b; i++) {
                res[x++] = matrix[i][r];
            }
            if (--r < l) {
                break;
            }
            // r -> l
            for (int i = r; i >= l; i--) {
                res[x++] = matrix[b][i];
            }
            if (--b < t) {
                break;
            }
            // b -> t
            for (int i = b; i >= t; i--) {
                res[x++] = matrix[i][l];
            }
            if (++l > r) {
                break;
            }
        }
        return res;
    }
}
