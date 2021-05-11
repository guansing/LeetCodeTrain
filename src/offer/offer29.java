package offer;

public class offer29 {
    public int[] spiralOrder(int[][] matrix) {
        // 对0进行判断,否则边界Length-1的时候就会发生越界错误
        if (matrix.length==0) {
            return new int[0];
        }

        int x = 0;
        int l = 0;
        int r = matrix[0].length-1;
        int t = 0;
        int b = matrix.length-1;
        int[] res = new int[(r+1) * (b+1)];

        while (true) {
            // l -> r
            for (int i = l; i <= r; i++) {
                res[x++] = matrix[t][i];
            }
            if (++t > b) {
                break;
            }
            // r -> b
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
